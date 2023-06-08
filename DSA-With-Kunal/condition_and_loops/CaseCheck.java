import java.util.Scanner;

public class CaseCheck
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		char ch = input.next().trim().charAt(0);
		if (ch >= 'A' && ch <= 'Z')
			System.out.println("This is a capital case");
		else
			System.out.println("This is a small case");
	}
}
