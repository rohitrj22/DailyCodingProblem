// Good morning! Here's your coding interview problem for today.

// This problem was asked by Facebook.

// Given a array of numbers representing the stock prices of a company in chronological order, write a function that calculates the maximum profit you could have made from buying and selling that stock once. You must buy before you can sell it.

// For example, given [9, 11, 8, 5, 7, 10], you should return 5, since you could buy the stock at 5 dollars and sell it at 10 dollars.


public class BuyAndSellStock {

    public int maxProfit(int[] prices) {
        
        int res=0;
        int l=0,r=1;
        int n=prices.length;
        int min_buy = prices[0];
        while(l<n && r<n)
        {
            if(prices[r]<min_buy)
            {
                l=r++;
                min_buy=prices[l];
            }
            else
            {
                res = Math.max(res,prices[r]-prices[l]);
                r++;
            }
        }
    return res;
        
    }

    
}
