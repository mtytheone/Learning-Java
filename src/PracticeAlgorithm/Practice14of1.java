//読み込んだ段数を一辺としてもつ正方形を*記号で表示するプログラムを作成せよ。

package PracticeAlgorithm;
import java.util.Scanner;

public class Practice14of1 {

	public static void main(String[] args)
	{
		Scanner stdIn=new Scanner(System.in);
		System.out.println("正方形を表示します。");
		int n;
		while(true)
		{
			System.out.print("段数は:");
			n=stdIn.nextInt();
			if(n>0) break;
			System.out.println("正の整数を入力してください！");
		}

		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
