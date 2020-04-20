package PracticeJava16;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Practice1of16 extends Frame
{
	private Label lb;

	public static void main(String[] args)
	{
		Practice1of16 app=new Practice1of16();
	}

	public Practice1of16()
	{
		super("練習問題1");

		lb=new Label("Hello");

		add(lb);

		lb.setForeground(Color.blue);
		lb.setFont(new Font("Serif", Font.ITALIC, 32));

		addWindowListener(new thisWindowListener());

		setSize(250, 200);
		setVisible(true);
	}

	class thisWindowListener extends WindowAdapter
	{
		public void windowClosing(WindowEvent e)
		{
			System.exit(0);
		}
	}
}
