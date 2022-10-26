
public class reversestring 
{
 public static void main(String args[])
 {
	 String s="Geeks";
	 int n=s.length();
	 char a[]=s.toCharArray();
	 int j=n-1;
	 char temp;
	 
	 for(int i=0;i<n/2;i++)
	 {
		 temp=a[i];
		 a[i]=a[j];
		 a[j]= temp;
		 
		j--;
		 
	 }
	System.out.println(a);
 }
}
