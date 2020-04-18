//九九の掛け算ではなく足し算を行う表を表示するプログラムを作成せよ。

package PracticeAlgorithm;

public class Practice13of1 {

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
				System.out.printf("%3d", i+j);
			}
			System.out.println();
		}
	}
}
