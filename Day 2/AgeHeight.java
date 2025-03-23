import java.util.Scanner;
class AgeHeight
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Amar Age and Height: ");
		int amar_age = input.nextInt();
		int amar_height = input.nextInt();
		
		System.out.print("Enter Akbar Age and Height: ");
		int akbar_age = input.nextInt();
		int akbar_height = input.nextInt();
		
		System.out.print("Enter Anthony Age and Height: ");
		int anthony_age = input.nextInt();
		int anthony_height = input.nextInt();		
		
		int youngestAge = Math.min(amar_age,Math.min(akbar_age,anthony_age));
		int tallestHeight = Math.max(akbar_height,Math.max(amar_height,anthony_height));
		
		String YoungestFriend = "";
		String TallestFriend = "";
		
		if (youngestAge == amar_age) 
		{
            YoungestFriend = "Amar";
        } 
		else if (youngestAge == akbar_age) 
		{
			YoungestFriend = "Akbar";
        } 
		else 
		{
			YoungestFriend = "Anthony";
        }
		
		if (tallestHeight == amar_height) 
		{
			TallestFriend = "Amar";
        } 
		else if (tallestHeight == akbar_height) 
		{
			TallestFriend = "Akbar";
        } 
		else 
		{
			TallestFriend = "Anthony";
        }
		System.out.println("YoungestFriend is "+YoungestFriend+" and Tallest Friend is "+TallestFriend);
	}
}