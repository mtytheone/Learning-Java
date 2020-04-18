//たとえば、1から10までの和は(1 + 10) * 5によって求められる。ガウスの方法と呼ばれる、この方法を用いて和を求めるプログラムを作成せよ。

package PracticeAlgorithm;
import java.util.Scanner;

public class Practice8of1
{
	public static void main(String[] args)
	{
		Scanner stdIn=new Scanner(System.in);

		System.out.println("1からnまでの和を求めます。");
		System.out.println("nの値:");
		int n=stdIn.nextInt();

		int sum=(int)((0.5f*n)*(1+n));

		System.out.println("1から"+n+"までの総和は"+sum+"です。");
	}
}
