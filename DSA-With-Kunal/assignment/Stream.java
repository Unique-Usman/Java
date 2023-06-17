import java.util.Scanner;
public class Stream {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // System.out.println("Insert number");
        // int num = input.nextInt();

        // if( num % 2 == 0){
        //     System.out.println("The number is even");
        // }
        // else {
        //     System.out.println("The number is odd");
        // }

        // input.nextLine();
        // String name = input.nextLine();

        // System.out.println("Hello " + name.trim() + " You are welcome");


        // System.out.println("Now we want to calculate Simple interest");

        // System.out.println("Input the principal");
        // int P = input.nextInt();
        // System.out.println("Input the Time");
        // int T = input.nextInt();
        // System.out.println("Input the rate");
        // int R = input.nextInt(); 

        // double SI = P * T * R / 100;
        // System.out.println("The interest is: " + SI);

        // System.out.println("Now let's make a calculator");
        // System.out.println("Input the first number");
        // int a  = input.nextInt();
        // System.out.println("Input the next numebr");
        // int b = input.nextInt();
        // input.nextLine();
        // int c;
        // // input.next();
        // System.out.println("Input the sign");
        // char sign = input.nextLine().trim().toUpperCase().charAt(0);

        // if (sign == '+'){
        //     c = a + b;
        //     System.out.println(c);
        // }else if (sign == '-'){
        //     c = a - b;
        //     System.out.println(c);
        // }
        // else if (sign == '/')
        // {
        //     c = a / b;
        //     System.out.println(c);
        // }else if (sign == '*'){
        //     c = a * b;
        //     System.out.println(c);
        // }

        System.out.println("Now let check fibonacci number");

        System.out.println("Input the number which you want to find fibonaci up to");
        int a = input.nextInt();
        
        int count = 0;
        int v = 0;
        int c = 1;
        int k = 0; 
        while (count <= a){
        
            if (count == 0){
                System.out.println(0);
            }else if(count == 1){
                System.out.println(1);
            }else{
                if (count == 2){
                    k = v + c;
                    System.out.println(k);
                }else{
                    v = c;
                    c = k;
                    k = c + v;
                    System.out.println(k);
                }
            }

            count++;
        }

         input.nextLine();

         System.out.println("Let check if the string is palindrome");

         boolean y = true;
         String str = input.nextLine().trim();

         for(int i = 0; i <= str.length() / 2; i++){
                if (str.charAt(i) != str.charAt(str.length() - 1 - i)){
                    y = false;
                }
         }
         if (y == true)
         System.out.println("It is palindrome");
    }

}
