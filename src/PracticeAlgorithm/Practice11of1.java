//正の整数値を読み込んで、その値の桁数を表示するプログラムを作成せよ。たとえば、135を読み込んだら『その数は3桁です。』と表示し、1314を読み込んだら『その数は4桁です。』と表示すること。

package PracticeAlgorithm;
import java.util.Scanner;

public class Practice11of1 {

	public static void main(String[] args)
	{
		Scanner stdIn=new Scanner(System.in);
		System.out.println("正の整数値を入力してください。");
		int n, count=0;

		while(true)
		{
			System.out.print("整数値:");
			n=stdIn.nextInt();
			if(n>0) break;
			System.out.println("正の整数値を入力してください！");
		}

		int tmp=n;

		while(tmp>0)
		{
			tmp/=10;
			count++;
		}

		System.out.println(n+"の桁数は"+count+"です。");
	}
}
