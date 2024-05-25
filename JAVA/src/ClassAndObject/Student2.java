package ClassAndObject;
import java.util.Scanner;
public class Student2 {
	int age;
	String name;
	String address;
	
	public Student2(String name,int age,String address)
	{
		this.name=name;
		this.age=age;
		this.address=address;
	}
	public void getname(int i)
	{
		System.out.println(i+"\t"+name+"\t"+age+"\t"+address);
	}
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Class Strength:");
		int classStrength=scan.nextInt();
		scan.nextLine();
		Student2[] obj=new Student2[classStrength];
		for(int i=0;i<obj.length;i++)
		{
			System.out.println("Enter Student "+(i+1)+" Details:");
			System.out.println("Enter Name:");
			String name=scan.nextLine();
			System.out.println("Enter Age:");
			int age=scan.nextInt();
			scan.nextLine();
			System.out.println("Enter Address:");
			String address=scan.nextLine();
			obj[i]=new Student2(name,age,address);
			System.out.println();
		}
		System.out.println("S.NO\tName\tAge\tAddress");
		for(int i=0;i<obj.length;i++)
		{
			obj[i].getname(i);
		}
		scan.close();
		//used to return back the resource to the system 
		//(when executing program we took storage for storing input after finishing program 
		//by using scan.close we can able to return it properly
	}
}
