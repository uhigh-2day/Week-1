class ProfitLoss
{
	public static void main(String args[])
	{
		int Cost_price = 129;
		int Sell_price = 191;
		int Profit = Sell_price - Cost_price;
		float Profit_percentage = ((float)Profit/(float)Cost_price)*100;
		System.out.println("The Cost Price is INR " + Cost_price +" and Selling Price is INR " + Sell_price + "\nThe Profit is INR " + Profit + " and the Profit Percentage is " + Profit_percentage);
	}
}
