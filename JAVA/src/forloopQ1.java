/*
Get input for variable a and b
and print the number from a to b
input
5
10
output
5
6
7
8
9
10
 */
import java.lang.System;//it has system.in and system.out it will run automatically 
//no need add in program for reference i added this line
import java.util.Scanner;
public class forloopQ1{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter starting number");
		int num1=scan.nextInt();
		System.out.println("Enter Ending number");
		int num2=scan.nextInt();
		for(int i=num1;i<=num2;i++)
		{
			System.out.println(i);
		}
	}
}
