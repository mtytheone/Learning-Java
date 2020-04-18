//身長だけでなく人数も乱数で生成するようにList 2-5を書きかえたプログラムを作成せよ。

package PracticeAlgorithm2;
import java.util.Random;

public class Practice1of2
{
	static int maxOf(int[] a)
	{
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max) max=a[i];
		}
		return max;
	}

	public static void main(String[] args)
	{
		Random rand=new Random();

		System.out.println("身長の最大値を求めます、");
		int count=rand.nextInt(10);
		System.out.println("人数は"+count+"人");
		int[] height=new int[count];
		System.out.println("身長は次のようになっています、");
		for(int i=0;i<count;i++)
		{
			height[i]=100+rand.nextInt(90);
			System.out.println("height["+i+"]:"+height[i]);
		}
		System.out.println("最大値は"+maxOf(height)+"です。");
	}
}
