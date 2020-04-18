package PracticeJava10;

import java.io.*;

public class Practice4of10
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("整数を二つ入力してください。");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str1=br.readLine();
		int num1=Integer.parseInt(str1);
		String str2=br.readLine();
		int num2=Integer.parseInt(str2);
		int num=Math.min(num1, num2);
		System.out.println(num1+"と"+num2+"のうち小さい方は"+num+"です。");
	}
}
