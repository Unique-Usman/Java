#include <iostream>
#include <vector> 

using namespace std;

int findInMountainArray(int target, vector<int> mountainArr) {
        int start = 0;
        int end = mountainArr.size() - 1;
        int ans = -1;
        while (start < end){
            int mid = start + (end - start) / 2;

            if (mountainArr[mid] < mountainArr[mid + 1]){
               start = mid + 1;
            }else {
                end = mid;
            }
        }

        int tmpend = end;
	
        if (mountainArr[end] >= target){
            start = 0;
            
            while (start <= end){
                int mid = start + (end - start) / 2;

                if (mountainArr[mid] < target){
                    start = mid + 1;
                }else if (mountainArr[mid] > target){
                    end = mid - 1;
                }else{
                    end = mid - 1;
                }
            }
            if (mountainArr[start] == target)
            {
                return start; 
            }

            start = tmpend;
            end = mountainArr.size() - 1;
            while (start <= end){
                int mid = start + (end - start) / 2;

                if (mountainArr[mid] < target){
			end = mid -1;
                }else if (mountainArr[mid] > target){
                    start = mid + 1;
                }else{
		   // tmpend = mid;
                    //end = mid - 1;
		    return mid;
                }
            }
	   cout << tmpend << endl; 
            if (mountainArr[tmpend] == target)
            {
                return tmpend; 
            }

        }

        return -1;

        
}

int main()
{
	vector<int> arr = {0,1,3,4,2,2,2,2,1};

	cout << findInMountainArray(2, arr) << endl;


