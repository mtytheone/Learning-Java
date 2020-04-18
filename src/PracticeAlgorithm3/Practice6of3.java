//探索に失敗した場合に、挿入ポイントを表示するように、List 3-5を書きかえたプログラムを作成せよ。

package PracticeAlgorithm3;
import java.util.Arrays;
import java.util.Scanner;

class Practice6of3
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);

		System.out.print("要素数：");
		int num = stdIn.nextInt();
		int[] x = new int[num];

		System.out.println("昇順に入力してください。");

		System.out.print("x[0]：");
		x[0] = stdIn.nextInt();

		for (int i=1; i<num; i++)
		{
			do
			{
				System.out.print("x[" + i + "]：");
				x[i] = stdIn.nextInt();
			}while (x[i]<x[i - 1]);
		}

		System.out.print("探す値：");
		int ky = stdIn.nextInt();

		int idx = Arrays.binarySearch(x, ky);

		if (idx<0)
		{
			int ins = -idx - 1;
			System.out.println("その値の要素は存在しません。");
			System.out.print(x[ins]+"の直前に"+ky+"を挿入すると配列のソート状態が維持されます。");
		}
		else System.out.println("その値はx[" + idx + "]にあります。");
	}
}