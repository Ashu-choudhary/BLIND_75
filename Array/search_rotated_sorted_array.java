package Array;

public class search_rotated_sorted_array {

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};

        int target = 9;

        System.out.println(search(arr,target));
    }

    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int middle;

        while (low <= high) {
            middle = (low + high) / 2;
            if (nums[middle] == target) {
                return middle;
            }
            if (nums[low] <= nums[middle]) {
                if (nums[low] <= target && target < nums[middle]) {
                    high = middle - 1;
                } else {
                    low = middle + 1;
                }
            } else {
                if (nums[middle] < target && target <= nums[high]) {
                    low = middle + 1;
                } else {
                    high = middle - 1;
                }
            }
        }
        return -1;
    }
}
