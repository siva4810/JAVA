//syntax variable=(condition)?valueiftrue : valueiffalse;
import java.util.Scanner;
public class ternary_operator {
	public static void main(String[] args) {
		int result=true?1:0;//same like ifelse if true first one will print 
		//else second one will print
		String result1=false?"yes":"no";
		System.out.println(result);
		System.out.println(result1);
	//greater than using ternary operator
		String result2=(5>3)?"yes":"no";
		System.out.println(result2);
	//rain problem	
		boolean rain=true;
		String result3=rain?"take umbrella":"enjoy";
		System.out.println(result3);
	//which num is greater using ternary
		Scanner scan=new Scanner(System.in);
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		String result4=(num1>num2)?num1+" is greater than "+num2:num2+" is greater than "+num1;
		System.out.println(result4);
	}

}
