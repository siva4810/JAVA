public class nestedforloop{
	public static void main(String[] args) {
		System.out.println("NORMAL NESTED LOOP FORMAT");
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=2;j++)
			System.out.println("Siva");
		}//siva prints 10 times (5 times outer for loop will run inside for loop run 2 times so 5x2=10
		System.out.println();
/*EXAMPLE QUESTION
 * Teacher 1 => Asked you to write the word
John 5 times on the board
Teacher 2 => Asked you to write the word
John 5 times on the board
 */
		
//without using nested for loop see same line of code repeated 
//so we can using nested for loop to reduce the line
		System.out.println("WITHOUT USING NESTED FOR LOOP");
		for(int i=1;i<5;i++)//teacher 1
		{
			System.out.println("John");
		}
		for(int i=1;i<5;i++)//teacher 2
		{
			System.out.println("John");
		}
		System.out.println();
		/*
		 * two teacher are doing the same operation 
		 * so we can use nested for loop 
		 * instead for using separate for loop for each teacher
		 */
		System.out.println("USING NESTED FOR LOOP");
		for(int i=1;i<=2;i++)//if teacher three is there you can give i<=3 no need to create three for loop
		{
			for(int j=1;j<=5;j++)
			{
				System.out.println("John");
			}
		}
	}
}