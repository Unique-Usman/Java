public class InfiniteBinSearch {
    public static void main(String[] args) {
        int[] arr = {1,4,5,6,7,8,9,10,12, 24,25,45,67,75,78,90,99,100,123};

        System.out.println(search(arr, 45));
    } 
    
    static int search(int[] arr, int target){
        int start = 0; 
        int end  = 1; 

        while (target > arr[end]){
            int tmp = end  + 1;
            end = end + (end - start + 1) * 2;
            start = tmp;

        }

        return BinarySearch(start, arr, end, target);
    }

   static int BinarySearch(int start, int [] arr, int end, int target){   
        while (start <= end){
            int mid = start + (end - 1) / 2;

            if(arr[mid] < target){
                start = mid + 1;
            }else if (arr[mid] > target){
                end = mid - 1;
            } else {
                return mid;
            }
        }
    return -1; 
    }
}