import java.util.Scanner;
public class crossString 
{
	public static void main(String[] args) {

String s="sreShambiya";
	
    int len,i,j;
	len=s.length();
	if(len%2==0)
	{
		System.out.println("only odd String");
	    }
	else
	{
	  for(i=0;i<len;i++)
	  {
		  for(j=0;j<len;j++)
	      {
			  if(i==j)
			  {
				  System.out.print(s.charAt(i)+" ");
			  }
			  else if(i+j==(len-1))
				 
			  {
				  System.out.print(s.charAt(j)+" ");
			  }
			  else
			  {
				  System.out.print("  ");
			  }
		  }
		  System.out.println();
		   }}
	}
}