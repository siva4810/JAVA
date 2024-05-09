public class forloopQ3{
	public static void main(String[] args) {
		int count=0;
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)//to find odd number use (i%2==1)
			{
				//you can leave this empty no problem will occur or else you can use (continue;)
				//even numbers will be skipped
			}
			else
			{
				count++;
				System.out.println("odd number "+i);
			}
		}
		System.out.println("odd number count "+count);
	}
}