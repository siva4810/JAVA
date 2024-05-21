/*
3.Get input for 3 integer variables: a,b and c. Now multiply all
variables and store it in d. Now add all variables and store it in e.
Now divided d by e.
Sample Input:
->
10
20
10
Sample Output:
50
 */
package Question;

import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		int d=a*b*c;
		int e=a+b+c;
		System.out.println("Solution "+d/e);

	}

}
