//here input should be greater than 10 if it is less than 10 it will ask input again
import java.util.Scanner;
public class dowhileloop{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int count=0;
		do {
			System.out.println("Enter the number > 10");
			count=scan.nextInt();
		}while(count<=10);//if you enter less than 10 it will run again
	}
}