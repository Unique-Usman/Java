
import java.util.Scanner;

public class CountOccurrence
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Input the number you want to get the occurence from");
		long num = input.nextInt();
		System.out.println("Input the number you want to get it occurence");
		int n = input.nextInt();
		int count = 0;

		while (num != 0)
		{
			if (num % 10 == n)
			{
				count++;
			}
			num = num / 10;
		}
		
		System.out.println(count);
	}
}
