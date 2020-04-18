//三値の最小値を求めるメソッドを作成せよ。
// static int min3 (int a , int b , int c )

package PracticeAlgorithm;
import java.util.Scanner;

public class Practice2of1 {

	static int min3(int a, int b, int c)
	{
		int min=a;
		if(b<min) min=b;
		if(c<min) min=c;
		return min;
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
		System.out.println("最小値は"+min3(a,b,c)+"です。");
	}

}
