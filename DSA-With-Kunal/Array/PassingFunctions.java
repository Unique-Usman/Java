import java.util.Arrays;

public class PassingFunctions {
    static void change(int[] arr) {
        arr[0] = 99;
    }
    public static void main(String[] args) {
        int[] num = {3, 4, 5, 12};
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));
    }
}
