/*
 Question: What is the color of the traffic light?
If the answer is "red," print "Stop."
If the answer is "yellow," print "Get Ready"
If the answer is "green," print "Go."
 */
package IfElse;

import java.util.Scanner;
public class ifelseQ3{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String input=scan.nextLine();
		if(input.equals("red"))
		{
			System.out.println("Stop");
		}
		else if(input.equals("yellow"))
		{
			System.out.println("Get Ready");
		}
		else if(input.equals("green"))
		{
			System.out.println("Go");
		}
		else
		{
			System.out.println("invalid input");
		}
	}
}