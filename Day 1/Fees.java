class Fees
{
	public static void main(String args[])
	{
		int fee = 125000;
		int discountPercentage = 10;
		int discount = 125000 - ((125000*discountPercentage)/100);
		System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + (fee-discount));
	}
} 