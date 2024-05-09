//get 5 int number using for loop and array
import java.util.Scanner;
	public class arrayQ1{
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int[] q1=new int[5];
			for (int i=0;i<5;i++)
			{
				System.out.println("Enter element "+i);
				q1[i]=scan.nextInt();
			}
			for (int i=0;i<5;i++)
			{
				System.out.println("element "+i+"is "+q1[i]);

			}
	}
}