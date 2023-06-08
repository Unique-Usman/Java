import java.util.Scanner;

public class Input
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter some input: ");
		float word = input.nextFloat();
//		int rollno = input.nextInt();
//		System.out.println("Your rollno is " + rollno);
		System.out.println(word);
	}
}
