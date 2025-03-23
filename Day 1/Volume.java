class Volume
{
	public static void main(String args[])
	{
		double kilometer = 6378;
		double extra = 4/3;
		double pi = 3.14;
		double miles = kilometer * 1.6;
		double kmVol = (Math.pow(kilometer,3)) * pi * extra;
		double mVol = (Math.pow(miles,3)) * pi * extra;
		System.out.println("The volume of earth in cubic kilometers is " + kmVol + " and cubic miles is " + mVol);
	}
}