/*
4. Get Input for 3 variables: Name, Score, department. Let the user
enter the score for 100 Marks, you convert it for 10 and print it.
Sample Input:
John
56
Computer
Sample Output:
My name is John
My score is 5.6/10
My department is Computer
 */
import java.util.*;
public class Q4 {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		String name=scan.nextLine();
		double score=scan.nextInt();//u can use float also
		scan.nextLine();//to avoid empty space that will be stored in department
		String department=scan.nextLine();
		System.out.println("My name is "+ name);
		System.out.println("My name is "+ score/10+"/10");
		System.out.println("My name is "+ department);
	}

}
