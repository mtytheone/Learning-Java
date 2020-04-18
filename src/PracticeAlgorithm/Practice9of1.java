//整数a , b を含め、その間の全整数の和を求めて返す以下のメソッドを作成せよ。
// static int sumof (int a , int b )
//a とb の大小関係に関係なく和を求めること。たとえばa が3でb が5であれば12を、a が6でb が4であれば15を求めること。

package PracticeAlgorithm;
import java.util.Scanner;

public class Practice9of1
{
	static int sumof(int a, int b)
	{
		if(b<a)
		{
			int tmp=a;
			a=b;
			b=tmp;
		}
		return (int)((0.5*(b-a+1))*(a+b));
	}

	public static void main(String[] args)
	{
		Scanner stdIn=new Scanner(System.in);

		System.out.println("aからbまでの和を求めます。");
		System.out.println("aの値:");
		int a=stdIn.nextInt();
		System.out.println("bの値:");
		int b=stdIn.nextInt();

		int sum=sumof(a,b);

		System.out.println(a+"から"+b+"までの総和は"+sum+"です。");
	}
}
