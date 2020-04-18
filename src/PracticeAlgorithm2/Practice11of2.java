//右に示すように、西暦年月日をフィールドとしてもつクラスを作成せよ。以下に示すコンストラクタとメソッドを定義すること。
// ・コンストラクタ（与えられた日付に設定）
//   YMD (int y , int m , int d )
// ・n 日後の日付を返す
//   YMD after (int n )
// ・n 日前の日付を返す
//   YMD before (int n )

package PracticeAlgorithm2;
import java.util.Scanner;

public class Practice11of2
{

	static int[][] mdays= {
			{31,28,31,30,31,30,31,31,30,31,30,31}, //平年
			{31,29,31,30,31,30,31,31,30,31,30,31}, //閏年
	};

	static int isLeap(int year)
	{
		return (year%4==0&&year%100!=0||year%400==0)?1:0;
	}

	static class YMD
	{
		int y;
		int m;
		int d;

		YMD(int y, int m, int d)
		{
			this.y=y;
			this.m=m;
			this.d=d;
		}

		YMD after(int n)
		{
			YMD now=new YMD(this.y, this.m, this.d);
			now.d+=n>0?n:0;
			if(now.d>mdays[isLeap(y)][now.m-1])
			{
				while(now.d>=mdays[isLeap(y)][now.m-1])
				{
					now.d-=mdays[isLeap(y)][now.m-1];
					now.m++;
					if(now.m>12)
					{
						now.y++;
						now.m=1;
					}
				}
			}
			return now;
		}

		YMD before(int n)
		{
			YMD now=new YMD(this.y, this.m, this.d);
			now.d-=n>0?n+1:0;
			if(now.d<1)
			{
				while(now.d<0)
				{
					now.d+=mdays[isLeap(y)][now.m-1];
					now.m--;
					if(now.m<1)
					{
						now.y--;
						now.m=12;
					}
					if(now.d>mdays[isLeap(y)][now.m-1])
					{
						now.d=mdays[isLeap(y)][now.m-1];
						break;
					}
				}
			}
			return now;
		}
	}

	public static void main(String[] args)
	{
		Scanner stdIn=new Scanner(System.in);
		int retry, skip;
		YMD date=new YMD(0,0,0);

		System.out.println("現在の日にちを入力してください。");

		do
		{
			System.out.print("年:");
			date.y=stdIn.nextInt();
			System.out.print("月:");
			date.m=stdIn.nextInt();
			System.out.print("日:");
			date.d=stdIn.nextInt();
			System.out.print("前後させる日数:");
			skip=stdIn.nextInt();

			System.out.println("現在の日付は"+date.y+"年"+date.m+"月"+date.d+"日");
			YMD afterdate=date.after(skip);
			System.out.println(skip+"日後の日付は"+afterdate.y+"年"+afterdate.m+"月"+afterdate.d+"日");
			YMD beforedate=date.before(skip);
			System.out.println(skip+"日前の日付は"+beforedate.y+"年"+beforedate.m+"月"+beforedate.d+"日");

			System.out.print("もう一度しますか？（1...はい/0...いいえ）:");
			retry=stdIn.nextInt();
		}while(retry==1);
	}
}