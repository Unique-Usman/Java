import java.util.Arrays;
public class Sorted { 
    public static void main(String[] args) {
        int [][] arr = {
            {1, 4, 5},
            {6, 7, 8},
            {9, 10, 23}
        };
        System.out.println(Arrays.toString(search(arr, 23)));
    }

    static int [] search(int[][] arr, int target) {
        int start = 0;
        int end = arr.length * arr.length - 1;
        int col = arr.length;
        while (start <= end){
            int mid = start + (end - start) / 2;

            int r = mid / col;
            int c = mid % col;  

            if (arr[r][c] == target){
                return new int[]{r,c};
            }else if (arr[r][c] > target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return new int[] {-1, -1}; 
    }
}
