//List 1-4のwhile文終了時点における変数i の値がn + 1となることを確認せよ（変数i の値を表示するように書きかえたプログラムを作成せよ）。

package PracticeAlgorithm;
import java.util.Scanner;

public class Practice6of1 {

	public static void main(String[] args)
	{
		Scanner stdIn=new Scanner(System.in);
		System.out.println("1からnまでの和を求めます。");
		System.out.println("nの値:");
		int n=stdIn.nextInt();

		int sum=0, i=1;

		while(i<=n)
		{
			sum+=i;
			i++;
		}
		System.out.println("1から"+n+"までの値は"+sum+"であり、iの値は"+i+"です。");
	}

}
