//array int and string input format and adding all int input and printing it
package Array;


import java.util.Scanner;

public class array {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int[] abc = new int[5];
		// datatype[] object name=new datatype[inside enter the size of array];
//array int input and adding all input
		abc[0] = scan.nextInt();
		abc[1] = scan.nextInt();
		abc[2] = scan.nextInt();
		abc[3] = scan.nextInt();
		abc[4] = scan.nextInt();
		int sum = abc[0] + abc[1] + abc[2] + abc[3] + abc[4];
		System.out.println("sum of array is " + sum);
		String[] acd = new String[3];
		scan.nextLine();// this line is very use full with out this line i cant able to get three string
						// input
		// after int input if you ask string input first string
		// input will have empty line that is created by int input
		// so here i store the empty line in scan.nextLine();

//array string input
		acd[0] = scan.nextLine();
		acd[1] = scan.nextLine();
		acd[2] = scan.nextLine();
		System.out.println(acd[0]);
		System.out.println(acd[1]);
		System.out.println(acd[2]);
	}
}