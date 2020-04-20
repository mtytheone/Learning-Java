package PracticeJava16;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Practice3of16 extends Frame
{
	Image img;
	int x=10, y=10;

	public static void main(String[] args)
	{
		Practice3of16 app=new Practice3of16();
	}

	public Practice3of16()
	{
		super("練習問題3");

		Toolkit tk=getToolkit();
		img=tk.getImage("Image.gif");

		addWindowListener(new WindowAdapter()
				{
					public void windowClosing(WindowEvent e)
					{
						System.exit(0);
					}
				});

		addMouseListener(new MouseAdapter()
				{
					public void mousePressed(MouseEvent e)
					{
						x=e.getX();
						y=e.getY();
					repaint();
					}
				});

		setSize(250, 200);
		setVisible(true);
	}

	public void paint(Graphics g)
	{
		g.drawImage(img, x, y, this);
	}
}
