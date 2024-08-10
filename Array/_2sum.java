package Array;

import java.util.Arrays;

public class _2sum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 17;

        int[] ans = sum(arr,target);

        System.out.println(Arrays.toString(ans));

    }

    public static int[] sum(int[] arr, int target) {
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return new int[] {left,right};
            } else if
            (sum < target) left++;
            else
                right--;
        }
        return new int[] {};
    }
}
