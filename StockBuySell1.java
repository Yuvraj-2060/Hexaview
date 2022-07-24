//Author : Mr Singh
class StockBuySell1
{

	public static int maxProfit(int[] A,int n)
    {
     
        int buy=A[0];
        int max_profit=0;
        for(int i=1;i<n;i++)
        {
            if(buy>A[i])
                buy=A[i];
            else if(A[i]-buy>max_profit)
                max_profit=A[i]-buy;
        }
        return max_profit;
        
    }
	public static void main(String[] args)
	{
		int price[] = {5,2,6,1,4};
		int n = price.length;

		System.out.println(maxProfit(price, n));
	}
}

//This code is contributed by Mr Singh.
