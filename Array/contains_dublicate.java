package Array;

import java.util.HashSet;
import java.util.Set;

public class contains_dublicate {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,8,9,10};

        System.out.println(containDuplicate(arr));
    }

    public static boolean containDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int i=0; i<= nums.length - 1; i++){
            if(set.contains(nums[i])){
                return true;
            }
            else{
                set.add(nums[i]);
            }
        }
        return false;
    }
}
