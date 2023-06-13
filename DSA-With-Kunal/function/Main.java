import java.util.Scanner;
 public class Main {
    public static void main(String[] args){
        int c = 0;
        while (c < 10){
            Scanner input = new Scanner(System.in);
            System.out.println("Input the first number you want to add");
            int a = input.nextInt();
            System.out.println("Input the second number you want to add");
            int b = input.nextInt();
            System.out.println((a + b));
            c++;
        }

    }
}
