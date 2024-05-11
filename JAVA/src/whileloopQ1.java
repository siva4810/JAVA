//print random number if random number is 5 stop
import java.util.Random;//use to generate random number
public class whileloopQ1 {
	public static void main(String[] args)
	{
		Random obj=new Random();
		int newnum=0;//generated number will store in newnum
//here we don't know how many times it will run in this case we use while loop
		while(newnum !=5)
		{
		System.out.println("NEW NUMBER");
		newnum=obj.nextInt(10);
		System.out.println(newnum);
		}
		
	}
}
