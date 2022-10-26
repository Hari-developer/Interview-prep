import java.util.Arrays;

public class MinimumDiffSum {
	
	 int  MinDiff(int n,int arr[])
	 {
	     int i,j,s=0;
		for(i=0;i<n;i++)
		 
			 for( j=i+1;j<n;j++)
			 {
				 int temp=arr[i];
				 arr[i]=arr[j];
				 arr[j]=temp;
		     }
	 
		//Arrays.sort(arr);
			 
			 for( i=0;i<n-1;i++)
			 {
				  s+=Math.abs(arr[i]-arr[i+1]);
			 }
			 return s;
		 }
	
		 


	public static void main(String[] args) {
		MinimumDiffSum val=new MinimumDiffSum();
		
		int arr[]= {1,2,3,3,4};
		int n=arr.length;
		
		System.out.println(val.MinDiff(n,arr));
             
        
	}

}
