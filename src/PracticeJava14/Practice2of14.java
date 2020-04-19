package PracticeJava14;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Practice2of14
{
	public static void main(String[] args)
	{
		try
		{
			PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("test1.txt")));

			pw.println("A long time ago.");
			pw.println("There was a little girl.");

			System.out.println("ファイルに書き込みしました。");

			pw.close();
		}
		catch(IOException e)
		{
			System.out.println("入出力エラーです。");
		}
		finally
		{
			System.out.println("動作が完了しました。");
		}
	}
}
