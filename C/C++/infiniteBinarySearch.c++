#include <iostream>

class Search
{
	public:
		static int search(int arr[], int target)
		{
			int start = 0;
			int end = 1;

			while (target > arr[end])
			{
				int tmp = end + 1;

				end = end + (end - start + 1) * 2;
				start = tmp;
			}

			return BinarySearch(arr, target, end, start);
		}

		static int BinarySearch(int arr[], int target, int end, int start)
		{
			while (start <= end)
			{
				int mid = start + (end - start) / 2;
				if (target < arr[mid]){
					end = mid - 1;
				}else if (target > arr[mid]){
					start = mid + 1;
				}else {
					return mid;
				}
			}

			return -1;
		}
};

int main(){
    int arr[] = {1,4,5,6,7,8,9,10,12, 24,25,45,67,75,78,90,99,100,123};
    std::cout << "Hello World" << std::endl;
    std::cout << Search::search(arr, 45);
}
