import java.util.Arrays;
public class MultiDimension {
    
    public static void main(String[] args) {
        // int[][] arr = new int[3][];
        

       int[][] arr = {{2,3},{4,6,6,7},{3,4}};

       for (int ar[] : arr){
            System.out.println(Arrays.toString(ar));

            for (int a : ar){
                System.out.print(a + " ");
            }
            System.out.print("\n");
       }
    //    System.out.println(Arrays.toString(arr));
    }
}
