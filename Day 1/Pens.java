class Pens
{
	public static void main(String args[])
	{
		int pens = 14;
		int students = 3;
		int perstudent = pens/students;
		int remaining = pens % students;
		System.out.println("The Pen Per Student is " +perstudent+ " and the remaining pen not distributed is "+remaining );
	}
}	