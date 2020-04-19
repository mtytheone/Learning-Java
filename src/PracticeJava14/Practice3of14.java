package PracticeJava14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Practice3of14
{
	public static void main(String[] args)
	{
		if(args.length!=1)
		{
			System.out.println("ファイル名を正しく指定してください。");
			System.exit(1);
		}

		try
		{
			BufferedReader br=new BufferedReader(new FileReader(args[0]));

			String str;
			while((str=br.readLine())!=null) System.out.println(str);

			br.close();
		}
		catch(IOException e)
		{
			System.out.println("入出力エラーです。");
		}
		finally
		{
			System.out.println("動作が終了しました。");
		}
	}
}