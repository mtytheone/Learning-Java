package PracticeAlgorithm3;
import java.util.Scanner;

public class Practice5of3
{
	static int binSearch(int[] a, int n , int key)
	{
		int pl=0, pr=n-1;

		do
		{
			int pc=(pl+pr)/2;
			if(a[pc]==key) return pc;
			else if(a[pc]<key) pl=pc+1;
			else pr=pc-1;
		}while(pl<=pr);

		return -1;
	}

	static int binSearchX(int[] a, int n , int key)
	{
		int pl=0, pr=n-1;

		do
		{
			int pc=(pl+pr)/2;
			if(a[pc]==key)
			{
				while(true)
				{
					if(a[pc-1]!=a[pc]) break;
					pc--;
				}
				return pc;
			}
			else if(a[pc]<key) pl=pc+1;
			else pr=pc-1;
		}while(pl<=pr);

		return -1;
	}

	public static void main(String[] args)
	{
		Scanner stdIn=new Scanner(System.in);
		System.out.print("要素数:");
		int num=stdIn.nextInt();
		int[] x=new int[num];

		System.out.println("昇順に入力してください。");

		System.out.print("x[0]:");
		x[0]=stdIn.nextInt();

		for(int i=1; i<num; i++)
		{
			do
			{
				System.out.print("x["+i+"]:");
				x[i]=stdIn.nextInt();
			}while(x[i-1]>x[i]);
		}

		System.out.print("探す値:");
		int ky=stdIn.nextInt();

		int idx=binSearchX(x, num, ky);

		if(idx==-1) System.out.println("その値は要素に存在しません。");
		else System.out.println("その値はx["+idx+"]にあります。");
	}
}
