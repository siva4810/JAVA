/*
 • Create a class called "School" with main
function
• Create a function called passorfail which
should return the string "Pass/Fail"
• Inside Main function get integer input from
user for total mark.
• Pass that input to the passorfail function and
let the function decide whether student is
passorfail
 */
package FunctionParameter;

import java.util.Scanner;
public class functionparameterQ2 {
	String passorfail(int marks)
	{
		if(marks<35)
		{
			return "Fail";
		}
		else
		{
			return "Pass";
		}
	}
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int marks=scan.nextInt();
	functionparameterQ2 obj1=new functionparameterQ2();
	String result= obj1.passorfail(marks);
	System.out.println(result);
}
	
}
