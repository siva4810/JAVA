package GenerateRandomNumber;
import java.util.Random;//use to generate random number
public class generate_Random_Number {
	public static void main(String[] args)
	{
		Random obj=new Random();
		int generate=obj.nextInt(10);
		/*
		 * here to generate random number 
		 * first you should create object for random package
		 * then add data type and variable name 
		 * after that add your object name.nextdatatype(inside enter to range) example int generate=obj.nextInt(10);
		 * if you enter 10 it generate number between 10(it will generate (1 to 9)
		 */
		System.out.println("NEW NUMBER");
		System.out.println(generate);
		
	}
}
