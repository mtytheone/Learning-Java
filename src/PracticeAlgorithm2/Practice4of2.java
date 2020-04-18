//配列b の全要素を配列a にコピーするメソッドを作成せよ。
//  static void copy (int[] a , int[] b )

package PracticeAlgorithm2;

import java.util.Scanner;

public class Practice4of2
{
	static void copy(int[] a, int[] b)
	{
		for(int i=0;i<a.length;i++) b[i]=a[i];
	}

	public static void main(String[] args)
	{
		Scanner stdIn=new Scanner(System.in);
		System.out.print("要素数は:");
		int num=stdIn.nextInt();
		int[] a=new int[num];
		int[] b=new int[num];

		for(int i=0;i<num;i++)
		{
			System.out.print("x["+i+"]:");
			a[i]=stdIn.nextInt();
		}

		copy(a, b);
		for(int i=0;i<b.length;i++)
		{
			System.out.printf("%3d", b[i]);
		}
	}
}
