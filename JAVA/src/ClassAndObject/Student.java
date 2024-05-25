//we used set() , get() and constructor
package ClassAndObject;
public class Student
{
	String name;
	int age;
	String Address;
	public Student() //constructor(it will run when ever new object is created)
	{
		System.out.println("this is constructor");
	}
	public void setname(String name) //used to set name
	{
		this.name=name; //this.name represent class String name and (name represent method name)
	}
	public void setage(int age)
	{
		this.age=age;
	}
	public void setAddress(String Address)
	{
		this.Address=Address;
	}
	public String getname()
	{
		return name;
	}
	public int getage()
	{
		return age;
	}
	public String getAddress()
	{
		return Address;
	}
	public static void main(String[]args)
	{
		Student obj1=new Student();
		Student obj2=new Student();
		Student obj3=new Student();
		obj1.setname("siva");
		System.out.println(obj1.getname());

	}
}
