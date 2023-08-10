public class InfiniteSorted {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 6, 7, 8, 9, 12, 23, 44};
        System.out.println(infiniteBin(arr, 23));
    }
    private static int infiniteBin(int [] arr, int target) {
        int start = 0;
        int end = 1;

        while (arr[end] < target) {
            int tmp = end + 1;

            end = end + (end - start + 1) * 2;
        }
        return (binSimple(arr, target, start, end));
    } 
     private static int binSimple(int[] arr, int target, int start, int end)  {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }else if (arr[mid] > target) {
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
