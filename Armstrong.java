import java.util.Scanner;

public class Armstrong {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int num=sc.nextInt();
		
		
		int a=num;
		
	int	arm=0;
	
	while(num>0)
	{
		int rem=num%10;
		arm=arm+(rem*rem*rem);
		
		num=num/10;
		
	}
	if(arm==a)
	{
		System.out.println("armstrong");
	}
	else
	{
		System.out.println("Not armstrong");
	}
				
		
	}

}
