package WhileLoop;
public class whilelloop {
	public static void main(String[] args) {
		//print 1 to 10 in for loop
		System.out.println("    1 to 10 printed using for loop");
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		//print 1 to 10 using WHILE LOOP
		/*format for while loop
		 * initialize example int i=1
		 * while(condition) example while(i<=5)
		 * increment i=i+1 or i++
		 */
		System.out.println("1 to 10 printed using while loop");
//WHILE LOOP IS VERY USE FULL YOU CAN RUN WHILE LOOP UNTIL THE CONDITION IS FALSE (YOU CAN RUN INFINITELY)
		int j=1;
		while(j<=10)
		{
			System.out.println(j);
			j=j+1;
		}
	}
}
