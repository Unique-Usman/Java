import java.util.Scanner;

public class ReverseInt
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		long num = input.nextLong();

		long numrev = 0;

		while (num != 0)
		{
			int rem = (int)(num % 10);
			numrev = (numrev * 10) + rem;
			num /= 10;
		}

		System.out.println(numrev);
	}
}

