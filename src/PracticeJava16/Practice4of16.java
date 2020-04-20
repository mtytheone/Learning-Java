package PracticeJava16;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Practice4of16 extends Frame
{
	boolean bool;

	public static void main(String[] args)
	{
		Practice4of16 app=new Practice4of16();
	}

	public Practice4of16()
	{
		super("練習問題4");

		addWindowListener(new WindowAdapter()
				{
					public void windowClosing(WindowEvent e)
					{
						System.exit(0);
					}
				});

		addMouseListener(new MouseAdapter()
				{
					public void mouseEntered(MouseEvent e)
					{
						bool=true;
						repaint();
					}

					public void mouseExited(MouseEvent e)
					{
						bool=false;
						repaint();
					}
				});

		setSize(250, 200);
		setVisible(true);
	}

	public void paint(Graphics g)
	{
		if(bool) g.drawString("こんにちは", 100, 100);
		else g.drawString("さようなら", 100, 100);
	}
}