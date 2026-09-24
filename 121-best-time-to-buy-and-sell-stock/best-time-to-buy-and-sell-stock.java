class Solution {
    public int maxProfit(int[] prices) {
        int res=0;
        int minBuy=prices[0];
        for(int sell=0;sell<prices.length;sell++){
            if(prices[sell]<minBuy)
                minBuy=prices[sell];
            if(prices[sell]-minBuy>res)
                res=prices[sell]-minBuy;
        }
        return res;
    }
}