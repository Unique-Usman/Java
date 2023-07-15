public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 7};

        System.out.println(floor(arr, 6));
    }

    static int floor(int[] arr, int target){
        int start = 0; 
        int end = arr.length - 1;

        while (start <= end){ 
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }else if (arr[mid] < target) {
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }

        return start;
    }
}
