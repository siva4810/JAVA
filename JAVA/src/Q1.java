
/*
1.Get input for variable: Name and Age.
Print it
Sample Input:
John
24
Sample Output:
My name is John
My age is 24*/
import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		int age = scan.nextInt();
		System.out.println("My name is " + name);
		System.out.println("My age is  " + age);
	}
}
