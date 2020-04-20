package PracticeJava16;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Practice5of16 extends Frame implements Runnable
{
	int x=10, num;

	public static void main(String[] args)
	{
		Practice5of16 app=new Practice5of16();
	}

	public Practice5of16()
	{
		super("練習問題5");

		addWindowListener(new WindowAdapter()
				{
					public void windowClosing(WindowEvent e)
					{
						System.exit(0);
					}
				});

		Thread th=new Thread(this);
		th.start();

		setSize(250, 200);
		setVisible(true);
	}

	public void run()
	{
		try
		{
			for(int i=0; i<10; i++)
			{
				num=i;
				x+=10;
				repaint();
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e) {}
	}

	public void paint(Graphics g)
	{
		String str=num+"です。";
		g.drawString(str, x, 100);
	}
}