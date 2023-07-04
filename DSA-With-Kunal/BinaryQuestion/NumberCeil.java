public class NumberCeil {
    public static void main(String[] args) {
        int []arr = {2, 3, 5, 9, 14, 16, 18};

        System.out.println(ceil(arr, 20));
    }
    static int ceil(int[] arr, int num){
        if (arr[arr.length - 1] < num) return -1;
        int start = 0;
        int end = arr.length - 1;  

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (arr[mid] == num){
                return mid;
            }else if (arr[mid] < num){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }

        return start;
    }
}
