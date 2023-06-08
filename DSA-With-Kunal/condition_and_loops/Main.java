import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		System.out.println("Hello Wolrd");
		Scanner input = new Scanner(System.in);
		System.out.println(input.nextLine());
		for (int i = 0; i < args.length; i++)
		{
			System.out.println(args[i]);
		}
	}
}
