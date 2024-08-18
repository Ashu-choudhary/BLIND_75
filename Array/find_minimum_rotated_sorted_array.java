package Array;

public class find_minimum_rotated_sorted_array {
    public static void main(String[] args) {
        int[] arr = { 5,6,7,-5,1,2,3,4 };

        System.out.println(findMin(arr));
    }

    public static int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        while(left < right) {
            int mid = (right + left) / 2;

            if(nums[mid] < nums[right]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return nums[left];
    }
}
