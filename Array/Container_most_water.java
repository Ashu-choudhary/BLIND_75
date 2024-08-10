package Array;

public class Container_most_water {

    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};

        System.out.println(CWMW(arr));
    }


    public static int CWMW(int[] height){
            int maxArea = 0;
            int left = 0;
            int right = height.length - 1;

            while (left < right) {
                maxArea = Math.max(maxArea, (right - left) * Math.min(height[left], height[right]));

                if (height[left] < height[right]) {
                    left++;
                } else {
                    right--;
                }
            }

            return maxArea;
    }
}
