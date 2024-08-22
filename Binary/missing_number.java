package Binary;


public class missing_number {

        public static int missingNumber2(int []nums) {
            int n = nums.length;
            int s = (n * (n+1))/2;

            int s2 = 0;
            for (int num : nums) {
                s2 += num;
            }

            return s - s2;
        }

        public static void main(String[] args) {
            int[] a = {1};

            int ans2 = missingNumber2(a);
            System.out.println("The missing number is: " + ans2);
        }

}
