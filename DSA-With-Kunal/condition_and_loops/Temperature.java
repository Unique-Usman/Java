import java.util.Scanner;

public class Temperature
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Input the temperature you want to convert");
		double temp = input.nextDouble();

		double ans = temp * 9/5 + 32;
		System.out.println("The temperature in farenheit " + ans);
	}
}
