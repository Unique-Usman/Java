import java.util.Scanner;

public class Switch2
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();

		switch (num)
		{
			case 1 -> System.out.println("This is one");
			case 2 -> System.out.println("This is two");
			default -> System.out.println("This is the last one");
		}
	}
}
