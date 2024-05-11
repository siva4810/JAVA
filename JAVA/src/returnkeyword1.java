public class returnkeyword1{
	int sum(int num1,int num2)
	{
		int result=num1+num2;
		return result;
	}
	String getname(String s_name) 
	{
		return s_name;
	}
	public static void main(String[] args)
	{
		returnkeyword1 obj1 = new returnkeyword1();
		int sum=obj1.sum(14,23);
		System.out.println(sum);
		String name=obj1.getname("siva");
		System.out.println(name);
	}
}