//二つの変数a , b に整数値を読み込んでb - a の値を表示するプログラムを作成せよ。
//なお、変数b に読み込んだ値がa 以下であれば再入力させること。

package PracticeAlgorithm;
import java.util.Scanner;

public class Practice10of1 {

	public static void main(String[] args)
	{
		Scanner stdIn=new Scanner(System.in);

		System.out.println("二つの整数値（a<b）を入力してください。");

		System.out.print("aの値:");
		int a=stdIn.nextInt();
		int b;
		while(true)
		{
			System.out.print("bの値:");
			b=stdIn.nextInt();
			if(b>a) break;
			System.out.println("aより大きな値で入力せよ！");
		}

		int sub=b-a;
		System.out.println("b-aは"+sub+"です。");
	}
}
