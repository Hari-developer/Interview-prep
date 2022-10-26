import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the number");
		int num=sc.nextInt();
		
		
		int a=0,b=0,c=1;
		
	for(int i=0;i<num;i++)	
	{
		a=b;
		b=c;
		c=a+b;
		System.out.print(a+" ");
	}
	}

}
