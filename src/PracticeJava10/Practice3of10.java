package PracticeJava10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice3of10
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("文字列を入力してください。");
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		String str1=br1.readLine();
		System.out.println("aの挿入位置を整数で入力してください。");
		BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));
		String str2=br2.readLine();
		int num=Integer.parseInt(str2);
		StringBuffer sb=new StringBuffer(str1);
		sb.insert(num, 'a');
		System.out.println(sb+"になりました。");
	}
}
