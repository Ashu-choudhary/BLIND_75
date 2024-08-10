package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _3sum {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};

        List<List<Integer>> listOfLists = threesum(arr);

        for (List<Integer> list : listOfLists) {
            for (Integer num : list) {
                System.out.print(num + " ");
            }
            System.out.println(); // Move to the next line after each list
        }
    }
    public static List<List<Integer>> threesum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        for(int i=0; i<n; i++){
            if(i != 0  && nums[i] == nums[i-1]) continue;

            int j = i+1;
            int k = n-1;
            while(j < k){
                int sum = nums[i]+nums[k]+nums[j];

                if(sum<0){
                    j++;
                }else if(sum > 0){
                    k--;
                }
                else{
                    List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k]);
                    ans.add(temp);
                    j++;
                    k--;

                    while(j<k && nums[j] == nums[j-1])j++;
                    while(j<k && nums[k] == nums[k+1])k--;
                }
            }
        }
        return ans;
    }
}
