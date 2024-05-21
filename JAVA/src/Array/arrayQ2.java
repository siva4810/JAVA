/*
 * • Get Input for size on array
• Get input for each element
in an array
• Find and print middle
element in an array.
 */
package Array;

import java.util.Scanner;
public class arrayQ2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter the size of an array:");
		int size=scan.nextInt();
		int[] abc=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter element "+ i);
			abc[i]=scan.nextInt();
		}
		int length = abc.length;
	        if (length % 2 == 1) { // If the length is odd
	            int middleIndex = length / 2;
	            System.out.println(abc[middleIndex]);
	        } else { // If the length is even
	            int middleIndex1 = length / 2 - 1;
	            int middleIndex2 = length / 2;
	            System.out.println( abc[middleIndex1]+ "," + abc[middleIndex2]);
	
	        }

	}
}
