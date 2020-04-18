//配列要素の並びの逆転の経過を逐一表示するプログラムを作成せよ。

package PracticeAlgorithm2;
import java.util.Scanner;

public class Practice2of2
{
	static void swap(int[] a, int idx1, int idx2)
	{
		int t=a[idx1];
		a[idx1]=a[idx2];
		a[idx2]=t;
	}

	static void reverse(int[] a)
	{
		for(int i=0;i<a.length;i++) System.out.printf("%3d", a[i]);
		System.out.println();
		for(int i=0;i<a.length/2;i++)
		{
			System.out.println("a[" + i + "]とa[" + (a.length-1-i) + "]を交換します。");
			swap(a, i, a.length-1-i);
			for(int j=0;j<a.length;j++) System.out.printf("%3d", a[j]);
			System.out.println();
		}
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

		reverse(x);

		System.out.println("反転が終了しました。");
	}
}
