import java.util.Scanner;

public class ConditionAndLoop {
    static int factorial(int n){
        if (n == 0 || n == 1){
            return 1;
        }else{
            int fact = 1;
            while (n != 0){
                fact *= n;
                n--;
            }
            return fact;
        }
    }
    static int power (int n, int pow){

        if (pow == 0)
            return 1;
        int ans = 1; 
        while (pow != 0){
            ans *= n; 
            pow--;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the number you want to check it's factorial");

        int num = input.nextInt();
        System.out.println(factorial(num));
        System.out.println("Input the power of n");
        int pow = input.nextInt();
        System.out.println("The power is: " + power(num, pow));
    }   
}
