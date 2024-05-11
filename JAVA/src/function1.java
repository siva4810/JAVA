/*
Create a class called function1
this class should have 2 variables
a=10
b=20
Create a function called sum which should add a & b and print the total output
call the sum function from main method
 */
public class function1 {
	int a = 10;
	int b = 10;
	void sum()
	{
		System.out.println(a+b);
	}
	public static void main(String[] args)
	{
		function1 obj1 = new function1();
		obj1.sum();
	}
}
