
public class hello {

	public static void main(String[] args) {
		
		int arr[]= {1,0,3,7};
		int count=0;
		
		int n=arr.length;
		
		
		for(int i=0;i<n;i++) {
			if(arr[i]!=0)
			{
				arr[count++]=arr[i];
			}
			
		}
		
		while(count<n)
		{
			arr[count++]=0;
		}
			
		for(int j=0;j<n;j++)
		{
			System.out.println(arr[j]);
		}
		
	}
}
			