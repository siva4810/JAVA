package String;
import java.util.Scanner;
//ctrl+shift+f(used to align the entire program
public class string_comparison {
	public static void main(String[] args) {
	
		String f1 = "siva";//datatype variablename="string input";(must enter string input inside"")
		//for character input you should use '';
		String f2 = "siva";
		System.out.println(f1 == f2);
		/*
		f1 and f2 and t1 and t2 both are same but it is showing has false
		here in comparison it wont compare char 
		it will compare f1 address and f2 address 
		if it is same it will display true
		normal procedure it will create siva once 
		next time if siva comes has input it will map to previous 
		once so here two address will be same thats why it is true
		 */
		String t1 = new String("siva");
		String t2 = new String("siva");
		System.out.println(t1 == t2);
		/*
		here we mention new so first one will add siva in new place 
		and second siva will add in new place
		so here mapping cant be performed
		two has different address so it is not equal thats why it is(false)
		 */
		String t3 = new String("siva");
		String t4 = new String("siva");
		System.out.println(t3.equals(t4));//here if you use equals() you can able to compare two string content
		//(normally it will compare address)
		//here if you use equal() you can able to compare two string content not two address
		String t5 = "siva";
		String t6 = new String("siva");
		System.out.println(t5.equals(t6));
	}
}
