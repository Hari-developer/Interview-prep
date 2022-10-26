import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
	
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Number");
		
		int num=sc.nextInt();
		
		int original=num;
	
		
		int rem=0;
		
		while(num>0)
		{
			
		int	temp=num%10;
			rem=(rem*10)+temp;
			num=num/10;
			
		}
		
		if(original==rem)
		{
			System.out.println(original+" number is palindrome");
		}
		else
		{
			System.out.println(original+"Not palindrome");
		}
		
		
	}

}
