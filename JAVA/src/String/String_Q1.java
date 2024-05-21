package String;
import java.util.Scanner;
public class String_Q1{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String rcb = scan.nextLine();
		if(rcb == "win")
		{
			System.out.println("RCB WIN");
		}
		else
		{
			System.out.println("RCB lose");
		}
		/*
		 here we give same input win but it is showing false 
		 because it not comparing string content it comparing string address
		 use equals()
		 */
		if(rcb.equals("win"))//here i use equals() so it is comparing strings content two content are same true
		{
			System.out.println("RCB WIN");
		}
		else
		{
			System.out.println("RCB lose");
		}
	}
}