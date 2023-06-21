public class SearchingRange {
    public static void main(String[] args) {
        int [] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int target = 1000;
        System.out.println(search(nums, target, 0, nums.length));
        System.out.println(minimum(nums));
    }
    static Boolean search(int[] arr, int target, int begin, int end){
        if (end >= arr.length){
            end = arr.length - 1;
        }
        for (int i = begin; i <= end; i++){
            if (arr[i] == target ){
                return true;
            }
        }
        return false;
    }
    static int minimum(int[] arr){
        if (arr.length == 0) return -1;
        int min = arr[0];

        for (int a: arr){
            if (a < min) min = a;
        }
        return min;
    }
}
