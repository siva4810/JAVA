public class classandobject {//class is called as template 
//you can use it many time by creating new object
int coffee=10;
int tea=20;
public static void main(String[] args) {
	classandobject server1=new classandobject();//format for creating object here server1 is object
	System.out.println(server1.coffee);//object as full access to class 
	classandobject server2=new classandobject();
	System.out.println(server2.tea);
}
}
