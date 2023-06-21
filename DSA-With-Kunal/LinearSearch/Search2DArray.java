public class Search2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {23 ,4 ,5},
            {4, 5, 6},
            {4, 5, 6}
        };
        System.out.println(search(arr, 10));
    }

    static Boolean search(int[][] arr,int target ){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if (arr[i][j] == target){
                    return true;
                }   
            }
        }
        return false;

    }

}
