package IfElse;
import java.util.Scanner;
public class ifelseQ2{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		if(num%2==0)
		{
			System.out.println("Number is Even");
		}
		else
		{
			System.out.println("Number is Odd");
		}
	}
} 