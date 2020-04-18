//List 1-5のプログラムをもとにして、たとえばnが7であれば、『1から7までの和は28です。』と表示するのではなく、『1 + 2 + 3 + 4 + 5 + 6 + 7 = 28』と表示するプログラムを作成せよ。

package PracticeAlgorithm;
import java.util.Scanner;

public class Practice7of1
{
	public static void main(String[] args)
	{
		Scanner stdIn=new Scanner(System.in);

		System.out.println("1からnまでの和を求めます。");
		System.out.println("nの値:");
		int n=stdIn.nextInt();

		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum+=i;
			if(i!=n) System.out.print(i+"+");
			else System.out.print(i);
		}

		System.out.println("="+sum);
	}
}
