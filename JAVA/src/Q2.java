/*
2.Get input for variable: Name, Age and Address
Print it
Sample Input:
John
24
Chennai
Sample Output:
My name is John
My age is 24
My address is Chennai*/
import java.util.Scanner;

public class Q2 {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String name=scan.nextLine();
		int age = scan.nextInt();
/*
here after int if you ask string input it will not run
(reason first 18th string line run then 19 int line run when 19th line is in process it will not take 
entire line it will take only space that number needs so remaining space is stored 
in 27th third string(address) that why third string is not performed)
 */
/*
to avoid this use (scanner object.nextLine();(here my scanner object is (scan) so (scan.nextLine();
(this line is use to store the empty space that is created by int line )
now third string will run properly
 */
		scan.nextLine();
		String address=scan.nextLine();
		System.out.println("My name is "+name);
		System.out.println("My age is "+age);
		System.out.println("My address is "+address);
		
	}
}
