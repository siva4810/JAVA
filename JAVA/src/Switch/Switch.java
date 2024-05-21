package Switch;
import java.util.Scanner;
public class Switch{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num=1;
		switch(num)
		{
		case 0:
		{
			System.out.println("zero");
			break;
		}
		case 1:
		{
			System.out.println("one");
			break;
		}
		default:
		{
			System.out.println("Check Input");
		}
		}
	}
}
