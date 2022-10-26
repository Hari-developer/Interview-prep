import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the Number");
		
		int num=sc.nextInt();
		
		Boolean isPrime=false;
		
		
		if(num==0 || num==1)
		{
			System.out.println("Not Prime");
		}
		else
		{
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
				{
					isPrime=false;
					break;
				}
				
				else
				{
					isPrime=true;
				
				}
			}
			if(isPrime==true)
			{
				System.out.println("It is a prime number");
			}
			else
			{
				System.out.println("Not prime");
			}
			
			}
			
		
	

	}

}
