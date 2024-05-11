/*
void function_name(){}//syntax
//example
void apple()
{
print("This is fruit ")
 */
//mainly used to run the set of codes repeatedly by calling function name
public class function {
	//this program contain four function greeting(),siva(),sachien(),main()
	//main(String[] args)is also a function
	void greeting()
	{
		System.out.println("Welcome");
		siva();//greeting and siva both are non static so they can call each other
	}
	void siva()
	{
		System.out.println("i am siva");
	}
	static void sachien()
	{
		System.out.println("i am sachien");
	}
	public static void main(String[] args) {
		function obj1 = new function();
		obj1.greeting();
		obj1.siva();//it is not static function so u need to create object for class
		sachien();//here no object is created and called because two are static function
	}
}
