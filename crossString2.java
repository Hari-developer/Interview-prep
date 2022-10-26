import java.util.Scanner;

public class crossString2 
{
	public static void main(String[] args) {

	System.out.println("Enter the Strring");
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	
    
	int len,i,j;
	len=s.length();
	if(len%2==0)
		{
		return;
	    }
	else
	{
	  for(i=0;i<len;i++)
	  {
		  for(j=0;j<len;j++)
	      {
			  if(i==j)
			  {
				  System.out.print(s.charAt(i)+"  ");
			  }
			  else if(i+j==(len-1))
				 
			  {
				  System.out.print(s.charAt(j));
			  }
			  else
			  {
				  System.out.print("  ");
			  }
		  }
		  System.out.println();
		  
	  }
	}
	
	
	}
}