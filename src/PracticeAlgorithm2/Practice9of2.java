//y 年m 月d 日の年内の残り日数（12月31日であれば0、12月30日であれば1）を求める以下のメソッドを作成せよ。
// static int leftDayOfYear (int y , int m , int d )

package PracticeAlgorithm2;
import java.util.Scanner;

public class Practice9of2
{
	static int[][] mdays= {
			{31,28,31,30,31,30,31,31,30,31,30,31}, //平年
			{31,29,31,30,31,30,31,31,30,31,30,31}, //閏年
	};

	static int isLeap(int year)
	{
		return (year%4==0&&year%100!=0||year%400==0)?1:0;
	}

	static int leftDayOfYear(int y, int m, int d)
	{
		int days=mdays[isLeap(y)][m-1]-d;
		for(int i=m+1; i<=12;i++)
		{
			days+=mdays[isLeap(y)][i-1];
		}
		return days;
	}

	public static void main(String[] args)
	{
		Scanner stdIn=new Scanner(System.in);
		int retry;

		System.out.println("年内の経過日数を求めます。");

		do
		{
			System.out.print("年:");
			int year=stdIn.nextInt();
			System.out.print("月:");
			int month=stdIn.nextInt();
			System.out.print("日:");
			int day=stdIn.nextInt();

			System.out.printf("年内残り%d日です。\n", leftDayOfYear(year,month,day));

			System.out.print("もう一度しますか？（1...はい/0...いいえ）:");
			retry=stdIn.nextInt();
		}while(retry==1);
	}
}
