import java.util.Scanner;
public class Maini
 {
    public static void main(String[] args) {
        // int[] rnos = new int[5];
        // int[] rnos2 = {23, 12, 45, 32, 15};
        // int[] c = {3,4};
        // c[1] = 10;
        // System.out.println(c[1]);

        // String[] arr = new String[4];
        // System.out.println(arr[0]);

        // for (int a: rnos2){
        //     System.out.println(a);
        // }

        String[] s = new String[4];
         
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < s.length; i++){
            System.out.println("Input the " + (i + 1) + "element");
            s[i] = input.next();
        }
        for (int i = 0; i < s.length; i++){
            System.out.println(s[i]);
        }
        
    }
}
 