/**
 * Program to find the maximum profit from buying and selling stocks
 * Shows how to solve the stock buy-sell problem using arrays
 */
public class buySellStocks {
    /**
     * Main method - entry point of the program
     * Demonstrates finding maximum profit from stock prices
     * param args command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        // Loop through each price
        for (int i = 0; i < prices.length; i++) {
            // Update buyPrice if a lower price is found
            if (buyPrice > prices[i]) {
                buyPrice = prices[i];
            } else {
                // Calculate profit if selling at current price
                int profit = prices[i] - buyPrice;
                // Update maxProfit if current profit is higher
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        
        // Print the maximum profit
        System.out.println("Max profit = " + maxProfit);
    }
}

