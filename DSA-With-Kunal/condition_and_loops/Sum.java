import java.util.Scanner;

public class Sum
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Input the first Number");
		int a = input.nextInt();
		System.out.println("Input the second Number");
		int b = input.nextInt();

		System.out.println("The result of the addition is:" + ( a + b));
	}
}
