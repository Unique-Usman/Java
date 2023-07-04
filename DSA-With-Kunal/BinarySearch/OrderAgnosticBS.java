public class OrderAgnosticBS {
    public static void main(String[] args) {
        // int[] arr = {3, 4, 5, 6, 7};
        int[] arr = {7, 7, 6, 3};
       int ans =  orderAgnosticBS(arr, 6);
       System.out.println("The answer is: " + ans);
    }

    static int orderAgnosticBS(int[] arr, int target){
        int start = 0; 
        int end = arr.length - 1;

        //find whether the array is sorted in acending or descending;

        boolean isAsc  = arr[start] < arr[end];
         
        while (start <= end){
            int mid = start + (end - start) / 2;


            if (arr[mid] == target){
                return mid;
            }  
            if (isAsc){
                if (arr[mid] > target){
                    end = mid - 1;
                }else if (arr[mid] < target){
                    start = mid + 1;
                }
            }
            else{
                if (arr[mid] > target){
                    start = mid + 1;
                }else if (arr[mid] < target){
                    end = mid - 1;         
                }               
            }
        }
        return -1;
    }
}
