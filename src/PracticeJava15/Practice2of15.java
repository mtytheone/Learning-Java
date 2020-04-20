package PracticeJava15;

class Car1 implements Runnable
{
	private String name;

	public Car1(String nm)
	{
		name=nm;
	}

	public void run()
	{
		for(int i=0; i<5; i++) System.out.println(name+"の処理をしています。");
	}
}

public class Practice2of15
{

	public static void main(String[] args)
	{
		Car1 car1=new Car1("1号車");
		Thread th1=new Thread(car1);
		th1.start();

		Car1 car2=new Car1("2号車");
		Thread th2=new Thread(car2);
		th2.start();

		for(int i=0; i<5; i++) System.out.println("main()の処理をしています。");
	}
}
