//配列要素の並びの逆転の経過を逐一表示するプログラムを作成せよ。

package PracticeAlgorithm2;
import java.util.Scanner;

public class Practice3of2
{
	static int sumOf(int[] a)
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		return sum;
	}

	public static void main(String[] args)
	{
		Scanner stdIn=new Scanner(System.in);
		System.out.print("要素数は:");
		int num=stdIn.nextInt();
		int[] x=new int[num];

		for(int i=0;i<num;i++)
		{
			System.out.print("x["+i+"]:");
			x[i]=stdIn.nextInt();
		}

		System.out.println("配列の合計値は"+sumOf(x)+"です。");
	}
}
