/*
Get input for salary and age.
If salary greater than or equal to 20000 or age
less than or equal to 25,
get input for required loan amount. If not print
you are not eligible for loan.
If required loan amount is less than or equal
to 50,000 print You are
eligible for loan. If it is greater than 50,000
print maximum loan amount
is 50000.
*/
import java.util.Scanner;
public class ifelseQ4{
	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter Salary");
		int sal=scan.nextInt();
		System.out.println("Enter Age");
		int age=scan.nextInt();
		if(sal>=20000||age<=25)
		{
			System.out.println("You are eligible for loan");
			System.out.println("Enter your loan amount");
			int loan=scan.nextInt();
			if(loan<=50000)
			{
				System.out.println("Your amount is under limit ");
			}
			else
			{
				System.out.println("Your amount exceeds limit");
				System.out.println("You are eligible for your loan amount");
			}
		}
		else
		{
			System.out.println("You are not eligible for loan");
		}
	}
}