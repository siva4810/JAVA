//multiple input using class and object (Student Information)
package ClassAndObject;

import java.util.Scanner;

public class Student1 {
	String name;
	int age;
	String address;
	Scanner scan = new Scanner(System.in);

	public void setname() {
		System.out.println("Enter Name");
		this.name = scan.nextLine();
		System.out.println("Enter Age");
		this.age = scan.nextInt();
		scan.nextLine();
		System.out.println("Enter Address");
		this.address = scan.nextLine();
	}

	public void getname(int no) {
		System.out.println(no + "\t" + name + "\t" + age + "\t" + address);
	}

	public static void main(String[] args) {
		System.out.print("Enter The Class Strength ");
		Scanner scan=new Scanner(System.in);
		int classStrength=scan.nextInt();
		Student1[] obj = new Student1[classStrength];
		for (int i = 0; i < obj.length; i++) {

			System.out.println("Enter Details " + (i+1));
			obj[i] = new Student1();
			obj[i].setname();
		}

		System.out.println("S.no\tname\tage\taddress");
		for (int i = 0; i < obj.length; i++) {
			obj[i].getname(i);
		}
	}
}
