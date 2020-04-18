package PracticeJava10;

import java.io.*;

public class Practice2of10 {

	public static void main(String[] args) throws IOException
	{
		System.out.println("文字列を入力してください。");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String st=br.readLine();
		StringBuffer sb=new StringBuffer(st);
		sb.reverse();
		System.out.println(st+"を逆順にすると"+sb+"です");
	}

}
