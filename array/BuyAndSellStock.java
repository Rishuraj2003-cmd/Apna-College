package array;


public class BuyAndSellStock {

    public static int trackStock(int[] price) {

        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < price.length; i++) {
           
            if (buyPrice < price[i]) {
               int currProfit = price[i] - buyPrice;
                maxProfit = Math.max(maxProfit, currProfit);
            } else {
                buyPrice = price[i];
            }

        }
      
        return maxProfit;
    }

    public static void main(String[] args) {
        int price[] = { 7, 3, 4, 13, 1 };
        System.out.println("profit is : " +trackStock(price));
    }
}