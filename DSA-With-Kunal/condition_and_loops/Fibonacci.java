import java.util.Scanner;

public class Fibonacci
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Input the nth fibonacci number that you want to get");
		int num = input.nextInt();
		
		int a = 0;
		int b = 1;

		int sum = 0;
		while (num - 1 > 0)
		{
			sum = a + b;
			a = b;
			b = sum;
			num--;
		}

		System.out.println("THe 7th fibonacii is " + sum);
	}
}
