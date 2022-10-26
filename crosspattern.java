import java.util.*;
public class crosspattern {

	public static void main(String[] args) {

	System.out.println("Enter the number");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int i,j,m;
	m=(n+1)/2;
	
	   for(i=1;i<=n;i++) 
	   {
		   
		   for(j=1;j<=n;j++)
		   {
			   if(i==j)
			   {  
				   if(i<m) 
				   {
				   System.out.print(n-i+1);
				   }
				   else
				   {
					   System.out.print(i);
				   }
			   }
			   else if(i+j==n+1)
			   {
				   if(i<m)
				   {
					   System.out.print(i);
				   }
				   else 
				   {
					   System.out.print(j);
				   }
			   }
			   else
			   {
				   System.out.print(" ");
			   }
		   }
		   System.out.println();
	   }
	}

} 
