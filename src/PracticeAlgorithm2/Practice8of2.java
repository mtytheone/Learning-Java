//メソッドdayOfYear を、変数i とdays を使わずに実現せよ。while文を使うこと。

package PracticeAlgorithm2;
import java.util.Scanner;

public class Practice8of2
{
	static int[][] mdays= {
			{31,28,31,30,31,30,31,31,30,31,30,31}, //平年
			{31,29,31,30,31,30,31,31,30,31,30,31}, //閏年
	};

	static int isLeap(int year)
	{
		return (year%4==0&&year%100!=0||year%400==0)?1:0;
	}

	static int dayOfyear(int y, int m, int d)
	{
		int ptr=0, sum=0;

		while(ptr!=m-1)
		{
			sum+=mdays[isLeap(y)][ptr++];
		}
		return sum+d;
	}

	//答えはこれ。逆から足していくの凄く参考になった
	/*static int dayOfYear(int y, int m, int d) {
      while (--m != 0)
         d += mdays[isLeap(y)][m-1];
      return (d);
   }*/

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

			System.out.printf("年内で%d日目です。\n", dayOfyear(year,month,day));

			System.out.print("もう一度しますか？（1...はい/0...いいえ）:");
			retry=stdIn.nextInt();
		}while(retry==1);
	}
}
