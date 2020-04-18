package PracticeJava11;

class Car
{
	protected int num;
	protected double gas;

	public Car()
	{
		num=0;
		gas=0;
		System.out.println("車を作成しました。");
	}

	public void SetCar(int n, double g)
	{
		num=n;
		gas=g;
		System.out.println("ナンバーを"+num+"にガソリン量を"+gas+"にしました。");
	}

	public void show()
	{
		System.out.println("車のナンバーは"+num+"です。");
		System.out.println("ガソリン量は"+gas+"です。");
	}

	public String toString()
	{
		return "ナンバー"+num+"ガソリン量"+gas+"の車";
	}
}

public class Practice4of11
{

	public static void main(String[] args)
	{
		Car car=new Car();
		car.SetCar(1234, 20.5);
		System.out.println(car+"です。");
	}
}