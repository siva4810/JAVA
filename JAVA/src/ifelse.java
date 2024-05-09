import java.util.Scanner;
public class ifelse {
	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println(a==b);//boolean(true or false)
		System.out.println(a<b);//boolean
		if(a==b)//(true)
		{
			System.out.println("Equal");
		}
		else//(false)
		{
			System.out.println("Not Equal");
		}
		boolean rain=true;
		if(rain)//(true)
		{
			System.out.println("take umberalla");
		}
		else//(false)
		{
			System.out.println("enjoy");
		}
	}
}
