package Array;

public class max_subaray_sum {

    public static void main(String[] args) {

        int[] arr = {-2,1,-3,4,-1,2,1,5,4};

        System.out.println(maxSubArray(arr));
    }

    public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE, sum = 0;

        for (int num : nums) {
            sum += num;
            max = Math.max(sum, max);

            if (sum < 0) sum = 0;
        }

        return max;
    }
}
