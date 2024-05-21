//using array and for loop to get int input and add all the array input
package Array;

import java.util.Scanner;
public class array1{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size = scan.nextInt(); 
		int[] abc=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter Element "+(i+1));
			abc[i]=scan.nextInt();
		}
		int sum=0;
		for(int i=0;i<size;i++)
		{
			sum=sum+abc[i];
		}
		System.out.println("sum of array is "+sum);
	}
}