//method_overloading_or_function_overloading
//same function name with different parameter

public class method_overloading_or_function_overloading {
	void sum()
	{
		System.out.println("Welcome");
	}
	void sum(int a,int b)
	{
		System.out.println(a+b);
	}
	void sum(int a,int b, int c)
	{
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		method_overloading_or_function_overloading obj1 =new method_overloading_or_function_overloading();
		obj1.sum();
		obj1.sum(10, 20);
		obj1.sum(10, 20, 30);//same function name with three parameter
		//function name same (parameter input count is different) so here each function are different
	}
}
