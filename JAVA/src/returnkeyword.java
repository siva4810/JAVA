public class returnkeyword{
//	void getsoap(int money)                
//	{                                     same set of line is used below
//		int soap_price=15;                one word changed instead of void getsoap() (int getsoap is used)
//		int rem = money-soap_price;       void cannot return any value
//		return rem;                       here the result(rem) is in int value so we should use int instead of void
//	}
	int getsoap(int money)                
	{                                     
		int soap_price=15;                
		int rem = money-soap_price;       
		return rem;                       
	}
	int example()                
	{                                     
     
		return 125;                       
	}
	public static void main(String[] args) {
		returnkeyword obj1=new returnkeyword();
		int remainder=obj1.getsoap(20);//rem will store in remainder
		System.out.println("balance "+remainder);
		int ex=obj1.example();
		System.out.println("what you return will be printed you can refer example()"+ex);
	}
}
