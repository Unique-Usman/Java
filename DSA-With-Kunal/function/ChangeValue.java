import java.util.Arrays;
public class ChangeValue {
    public static void main(String[] args) {
        int [] arr = {1,2,4,};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void change(int[] arr) {
        arr[1] = 0;
    }
} 