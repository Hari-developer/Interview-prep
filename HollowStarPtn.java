import java.util.*;

public class HollowStarPtn {

	public static void main(String[] args)
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		if(n%2==0)
			{
             System.out.println("only odd values");		
             
             return;
		}
		
		 int outside_space=n/2;
		 int inside_space=1;
		
		 
		 
		 for(int i=0;i<n;i++)
		 {
			 
			 
			 for(int j=0;j<outside_space;j++)
				 System.out.print(" ");
			 
				 if(i<n/2)
					 outside_space-=1;
				 
				 else
				 
					 outside_space+=1;
				 
				 
				if( i==0 || i==n-1) 
				
					System.out.println("*");
				
				
				else
				{
					System.out.print("*");
				
				 for(int j=0;j<inside_space;j++) 
					 System.out.print(" "); 
				 
					 if(i<n/2)
					 
						 inside_space+=2;
					 
					 else
					 
						 inside_space-=2;
					 
					System.out.println("*"); 
					 
				 }
			 }
		}	
				
	}

				
				
				
		