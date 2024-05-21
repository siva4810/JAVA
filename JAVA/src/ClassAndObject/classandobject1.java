package ClassAndObject;
public class classandobject1 {//class is used to make the program organized
	String lapname="";
	String processor="";
	int ram=0;
	int price=0;
	public static void main(String[]args) {
		classandobject1 laptop1 = new classandobject1();
		laptop1.lapname="dell";
		laptop1.processor="i5";
		laptop1.ram=4;
		laptop1.price=540000;
		classandobject1 laptop2=new classandobject1();
		laptop2.lapname="asus";
		laptop2.processor="i9";
		laptop2.ram=8;
		laptop2.price=7987986;
		System.out.println(laptop1.lapname);//see here you can take what info you need 
		//by calling the object.whatinfoyouneed;
	}
}
