//n 段のピラミッドを表示する関数を作成せよ（右は4段の例）。
// static void spira (int n )
//第i 行目には(i - 1) * 2 + 1個の記号文字'*'を表示して、最終行である第n 行目には(n - 1) * 2 + 1個の記号文字'*'を表示すること。

package PracticeAlgorithm;
import java.util.Scanner;

public class Practice17of1 {

	static void spira(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++) System.out.print(' ');
			for(int j=1;j<=2*i-1;j++) System.out.print(i%10);
			for(int j=1;j<=n-i;j++) System.out.print(' ');
			System.out.println();
		}
	}

	public static void main(String[] args)
	{
		Scanner stdIn=new Scanner(System.in);
		int n;

		System.out.println("何行表示しますか？（自然数）");
		while(true)
		{
			System.out.print("表示行数:");
			n=stdIn.nextInt();
			if(n>0) break;
			System.out.println("自然数で入力してください！");
		}

		spira(n);
	}
}
