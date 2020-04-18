//要素数がn である配列a からkey と一致する全要素のインデックスを、配列idx の先頭から順に格納し、一致した要素数を返す以下のメソッドを作成せよ。
//  static int searchIdx (int[] a, int n, int key, int[] idx)

package PracticeAlgorithm3;
import java.util.Scanner;

public class Practice3of3
{
	static int searchIdx(int[] a, int n, int key, int[] idx)
	{
		int cnt=0;
		for(int i=0; i<n; i++)
		{
			if(a[i]==key)
			{
				idx[cnt]=i;
				cnt++;
			}
		}
		return cnt;
	}

	public static void main(String[] args)
	{
		Scanner stdIn=new Scanner(System.in);
		System.out.print("要素数:");
		int num=stdIn.nextInt();
		int x[]=new int[num];
		for(int i=0; i<num; i++)
		{
			System.out.print("x["+i+"]:");
			x[i]=stdIn.nextInt();
		}
		System.out.print("探したい数:");
		int key=stdIn.nextInt();
		int res[]=new int[num];
		int count=searchIdx(x, num, key, res);
		System.out.print(key+"の個数は"+count+"個あり、インデックスは「");
		for(int i=0; i<count; i++) System.out.print(res[i]+" ");
		System.out.println("」にあります。");
	}
}
