import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Add the number that you want to check it value");
        int num = input.nextInt();
        if (isPrime(num)) System.out.println("This is prime numnber");
    }

    static boolean isPrime(int a){
        int i = 2;
        if (a < 2) return false;

        int s = (int)Math.sqrt(a);
        while (i < s){
            if ((a % i) == 0) return false;
            i++;
        }
        return true;
    }
}
