package Array;

import java.util.Arrays;

public class product_array_except_self {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };

        System.out.println(Arrays.toString(product(arr)));
    }

    public static int[] product(int[] nums) {
        int n = nums.length;
        int[] res = new int[nums.length];
        int l=1,r=1;

        for(int i = 0; i<n; i++){
            res[i] = 1;
        }

        for(int i = 0; i<n; i++){
            res[i]*=l;
            l*=nums[i];
        }

        for(int i = n-1; i>=0; i--){
            res[i]*=r;
            r*=nums[i];
        }

        return res;
    }
}
