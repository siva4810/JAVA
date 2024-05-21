package FunctionParameter;
public class functionparameter{
	void getsoap(int money)//this is called as parameter ()
	//down i gave 34 it will be stored in money
	{
		System.out.println(money);
		System.out.println("Soap purchased");
	}
	void getchocolate(int money)
	{
		System.out.println(money);
		System.out.println("chocolate purchased");
	}
	public static void main(String[] args)
	{
		functionparameter obj1=new functionparameter();
		obj1.getsoap(34);//this is called parameter ()inside bracket it contains some values
		obj1.getchocolate(15);
	}
}