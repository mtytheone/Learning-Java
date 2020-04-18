//直角三角形を表示する部分を独立させて、以下の形式のメソッドとして実現せよ。
// static void triangleLB (int n )  // 左下側が直角の三角形を表示
//さらに、直角が左上側、右上側、右下側の三角形を表示するメソッドを作成せよ。
// static void triangleLU (int n )  // 左上側が直角の三角形を表示
// static void triangleRU (int n )  // 右上側が直角の三角形を表示
// static void triangleRB (int n )  // 右下側が直角の三角形を表示

package PracticeAlgorithm;
import java.util.Scanner;

public class Practice15of1 {

	static void triangleLU(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i;j++) System.out.print('*');
			System.out.println();
		}
	}

	static void triangleLB(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<i;j++) System.out.print('*');
			System.out.println();
		}
	}

	static void triangleRU(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i;j++) System.out.print(' ');
			for(int j=0;j<n-i;j++) System.out.print('*');
			System.out.println();
		}
	}

	static void triangleRB(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<n-i;j++) System.out.print(' ');
			for(int j=0;j<i;j++) System.out.print('*');
			System.out.println();
		}
	}

	public static void main(String[] args)
	{
		Scanner stdIn=new Scanner(System.in);
		int select, n;

		System.out.println("直角二等辺三角形を表示します。");
		System.out.println("どこを直角にしますか？");
		while(true)
		{
			System.out.println("左上:1, 左下:2, 右上:3, 右下:4");
			select=stdIn.nextInt();
			if(select>0&&select<5) break;
			System.out.println("1～4の整数値で入力してください！");
		}

		System.out.println("何行表示しますか？（自然数）");
		while(true)
		{
			System.out.print("表示行数:");
			n=stdIn.nextInt();
			if(n>0) break;
			System.out.println("自然数で入力してください！");
		}

		switch(select)
		{
			case 1:
				triangleLU(n);
				break;

			case 2:
				triangleLB(n);
				break;

			case 3:
				triangleRU(n);
				break;

			case 4:
				triangleRB(n);
				break;
		}
	}
}
