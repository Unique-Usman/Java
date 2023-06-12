import java.util.Scanner;

public class Sum {
    public static int sum(){
            Scanner input = new Scanner(System.in);
            System.out.println("Input the first number you want to add");
            int a = input.nextInt();
            System.out.println("Input the second number you want to add");
            int b = input.nextInt();
            return (a+ b);
    }
      
    public static void main(String[] args){
        int a = sum();
        System.out.println(a);
    }
}
