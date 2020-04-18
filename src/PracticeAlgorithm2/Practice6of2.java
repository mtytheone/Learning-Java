//配列の先頭側に下位桁ではなく上位桁を格納するメソッドを作成せよ。
//  static int cardConv (int x , int r , char[] d )

package PracticeAlgorithm2;
import java.util.Scanner;

public class Practice6of2
{
	static void swap(char[] a, int idx1, int idx2)
	{
		char t=a[idx1];
		a[idx1]=a[idx2];
		a[idx2]=t;
	}

	static void reverse(char[] a)
	{
		for(int i=0;i<a.length/2;i++)
		{
			swap(a, i, a.length-1-i);
		}
	}

	static int cardConv(int x, int r, char[] d)
	{
		int count=0;
		String dchar="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		do
		{
			d[count++]=dchar.charAt(x%r);
			x/=r;
		}while(x!=0);

		char[] tmp=new char[count];
		for(int i=0;i<count;i++)
		{
			tmp[i]=d[i];
		}

		reverse(tmp);
		d=tmp.clone();

		return count;
	}

	public static void main(String[] args)
	{
		Scanner stdIn=new Scanner(System.in);
		int num, radix, dnum, retry;
		char[] cnum=new char[32];

		System.out.println("10真数を基数変換します。");
		do
		{
			do
			{
				System.out.print("変換する非負の整数:");
				num=stdIn.nextInt();
			}while(num<0);

			do
			{
				System.out.print("何進数に変換しますか？（2～36）:");
				radix=stdIn.nextInt();
			}while(radix<2||radix>36);

			dnum=cardConv(num, radix, cnum);

			System.out.print(radix+"進数では");
			for(int i=0;i<dnum;i++)
			{
				System.out.print(cnum[i]);
			}
			System.out.println("です。");

			System.out.print("もう一度しますか？（1...はい/0...いいえ）:");
			retry=stdIn.nextInt();
		}while(retry==1);
	}
}
