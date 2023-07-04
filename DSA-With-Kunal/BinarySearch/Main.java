
public class Main {

    public static void main(String[] args) {
       int[] arr = {3, 4, 5, 6, 7};
       
       int ans =  binarySearch(arr, 6);
       System.out.println("The answer is: " + ans);
    }

    static int binarySearch(int[] arr, int key){
        int mid;
        int start = 0;
        int end = arr.length; 

        while (start <= end){
            mid = (start + end) / 2;
            if (arr[mid] == key){
                return mid;
            }else if (arr[mid] > key){
                end = mid - 1;
            }else if (arr[mid] < key){
                start = mid + 1;
            }
        }  

        return -1;
    }
}
