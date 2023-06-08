import java.util.Scanner;

public class TypeCasting
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		float num = input.nextFloat();
		System.out.println(num);

		int numb = (int)23.4f;

		byte a = 40;
		byte b = 50;
		byte c = 100;

		int d = (a * b) / c;

		System.out.println(d);
		System.out.println("你好");
	}
}
