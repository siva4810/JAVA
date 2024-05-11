/*
• Create a class called “Find” with main function
• Create a function called evenorodd with
integer parameter called int num
Inside Main function get integer input from
user.
• Pass that input to the evenorodd function and
let the function decide whether the number is
even or odd
 */
import java.util.Scanner;
public class functionparameterQ1 {
//	void evenorodd(int num1)
//	{
//		if(num1%2==0)
//		{
//			System.out.println("even number");
//		}
//		else
//		{
//			System.out.println("odd number");
//		}
//	}
	String evenorodd(int num1)
	{
		if(num1%2==0)
		{
			return "even number";
		}
		else
		{
			return "odd number";
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num=scan.nextInt();
		functionparameterQ1 obj1=new functionparameterQ1();
		obj1.evenorodd(num);
		String result=obj1.evenorodd(num);
		System.out.println(result);
	}
}
