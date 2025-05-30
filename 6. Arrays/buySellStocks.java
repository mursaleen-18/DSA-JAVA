// question:
// you are given an array prices where prices[i] is the
// price of a given stock on the ith da. You want to maximize your
// profit by choosing a single day to buy one stock and choosing a
// different day in the furutre to sell that stock. Return the maxmum
// profit you can achieve from this transaction. If you cannot achieve
// profit, return 0.

public class buySellStocks {

    public static int stocks(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) { // profit
                int profit = prices[i] - buyPrice; // todays profit
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(stocks(prices));
    }
}
