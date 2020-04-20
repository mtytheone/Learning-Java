package PracticeJava16;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Practice2of16 extends Frame
{
	public static void main(String[] args)
	{
		Practice2of16 app=new Practice2of16();
	}

	public Practice2of16()
	{
		super("練習問題2");

		addWindowListener(new thisWindowListener());

		setSize(250, 200);
		setVisible(true);
	}

	public void paint(Graphics g)
	{
		//g.drawRect(50, 50, 100, 100);
		g.fillRect(50, 80, 100, 100);
	}

	class thisWindowListener extends WindowAdapter
	{
		public void windowClosing(WindowEvent e)
		{
			System.exit(0);
		}
	}
}