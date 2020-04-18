//九九の表の上と左に、掛ける数を表示するプログラムを作成せよ。
//表示には、縦線記号文字'|'、マイナス記号文字'-'、プラス記号文字'+'を用いること。

package PracticeAlgorithm;

public class Practice12of1 {

	public static void main(String[] args)
	{
		System.out.printf("%4s", "l");
		for(int i=1;i<=9;i++)
		{
			System.out.printf("%3d", i);
		}
		System.out.println();
		for(int i=1;i<=31;i++)
		{
			if(i!=4) System.out.print("-");
			else System.out.print("+");
		}
		System.out.println();
		for(int i=1;i<=9;i++)
		{
			System.out.print(" "+i+" |");
			//System.out.printf("%2d |", i);
			for(int j=1;j<=9;j++)
			{
				System.out.printf("%3d", i*j);
			}
			System.out.println();
		}
	}
}
