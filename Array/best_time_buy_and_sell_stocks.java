package Array;

public class best_time_buy_and_sell_stocks {

    public static void main(String[] args) {
        int[] arr = {1,8,3,7,2,7,1,49};

        System.out.println(maxProfit(arr));
    }

    public static int maxProfit(int[] prices) {
        int maxCur = 0, maxSoFar = 0;
        for(int i = 1; i < prices.length; i++) {
            maxCur = Math.max(0, maxCur + (prices[i] - prices[i - 1]));
            maxSoFar = Math.max(maxCur, maxSoFar);
        }
        return maxSoFar;
    }
}
