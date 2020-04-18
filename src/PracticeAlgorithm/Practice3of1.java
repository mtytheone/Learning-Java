//四値の最小値を求めるメソッドを作成せよ。
// static int min4 (int a , int b , int c , int d )

package PracticeAlgorithm;
import java.util.Scanner;

public class Practice3of1 {

	static int min4(int a, int b, int c, int d)
	{
		int min=a;
		if(b<min) min=b;
		if(c<min) min=c;
		if(d<min) min=d;
		return min;
	}

	public static void main(String[] args)
	{
		Scanner str=new Scanner(System.in);
		System.out.println("4つの整数値を入力して5ください。");
		System.out.println("一つ目：");
		int a=str.nextInt();
		System.out.println("二つ目：");
		int b=str.nextInt();
		System.out.println("三つ目：");
		int c=str.nextInt();
		System.out.println("四つ目：");
		int d=str.nextInt();
		System.out.println("最小値は"+min4(a,b,c,d)+"です。");
	}

}
