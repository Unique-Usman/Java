import java.util.Scanner;

public class StringExample {
    public static String greet() {

        Scanner input = new Scanner(System.in);
        
        String name = input.next();
        String personalised = myGreet(name);
        
        return personalised;
    }

    static String myGreet(String name) {
        String message = "Hello " + name;
        return message;
    }

    public static int sum2(int a, int b)
    {
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
       String greeting =  greet();
       System.out.println(greeting);
       System.out.println(sum2(30,20));
    }
}