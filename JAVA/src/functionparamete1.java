public class functionparamete1 {
	void sum(int num1,int num2)
	{
		System.out.println("Sum");
		System.out.println(num1+num2);
	}
	void sub(int num1,int num2) {
		System.out.println("Difference");
		System.out.println(num1-num2);
	}
public static void main(String[] args) {
	functionparamete1 obj1=new functionparamete1();
	obj1.sum(156, 34);
	obj1.sub(234,221);
}
}
