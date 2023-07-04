public class BinarySearch2 {
    public static void main(String[] args) {
        int [] arr = {-8, -7, -6, -5, -4, -3, -2, -1, 0, 44};
        int ans = binSearch(arr, -6);
          System.out.println(ans);
    }

    static int binSearch(int[] arr, int target){
        int start = 0; 
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (arr[mid] == target){
                return mid;
            }else if (arr[mid] < target){
                start = mid + 1;
            }else if (arr[mid] > target){
                end = mid - 1;
            }
        }

        return -1; 
    }
}
