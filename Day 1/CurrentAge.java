class CurrentAge
{
	static int Age()
	{
		int birth_year = 2000;
		int current_year = 2024;
		return current_year - birth_year;
	}
	public static void main(String args[])
	{
		int age = CurrentAge.Age();
		System.out.println("Harry's age in 2024 is " + age);
	}
}