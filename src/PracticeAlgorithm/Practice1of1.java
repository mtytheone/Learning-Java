//四値の最大値を求めるメソッドを作成せよ（もちろん、それをテストするプログラム＝クラスを作成しなければならない）。
// static int max4(int a , int b , int c , int d )

package PracticeAlgorithm;
import java.util.Scanner;

public class Practice1of1 {

	static int max4(int a, int b, int c, int d)
	{
		int max=a;
		if(b>max) max=b;
		if(c>max) max=c;
		if(d>max) max=d;
		return max;
	}

	public static void main(String[] args)
	{
		Scanner str=new Scanner(System.in);
		System.out.println("4つの整数値を入力して5ください。");
		System.out.println("一つ目：");
		int a=str.nextInt();
		System.out.println("二つ目：");
		int b=str.nextInt();
		System.out.println("三つ目：");
		int c=str.nextInt();
		System.out.println("四つ目：");
		int d=str.nextInt();
		System.out.println("最大値は"+max4(a,b,c,d)+"です。");
	}

}
