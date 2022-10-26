import java.util.Scanner;

public class Duplicates {

	public static void main(String[] args) {
		
		
		
	Scanner sc=new Scanner(System.in);
			
	System.out.println("Enter the number of Elements");
	int n=sc.nextInt();
	
	int arr[]=new int[n];
	
	System.out.print("Enter tht elements");
	
	for(int i=0;i<arr.length;i++)
	{
		

		arr[i]=sc.nextInt();
		
		}

	
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]==arr[j])
			{
				System.out.println("Duplicates"+" "+arr[i]);
			}
		}

}
}
}