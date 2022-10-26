import java.util.Arrays;

class RotateArray {
    
     public static void rotate(int[] nums,int k)
	{
		if(k==nums.length ||nums.length==1 || nums==null)
		{
			return;
		}
		if(k>nums.length)
		{
			k=k%nums.length;//4%3=1
		}
		
		
		int left=0;
	    int right=nums.length-1-k;
	    int nextleft=right+1;
	    
	    while(left<right)
	    {
	    	int temp=nums[left];
	    	nums[left]=nums[right];
	    	nums[right]=temp;
	    	left++;
	    	right--;
	    }
	    
	    right=nums.length-1;
	    
	    while(nextleft<right)
	    {
	    	int temp=nums[nextleft];
	    	nums[nextleft]=nums[right];
	    	nums[right]=temp;
	    	nextleft++;
	    	right--;
	    }
	    
	    left=0;
	    right=nums.length-1;
	    while(left<right)
	    {
	    	int temp=nums[left];
	    	nums[left]=nums[right];
	    	nums[right]=temp;
	    	left++;
	    	right--;
	    }
	
	
	

}


public static void main(String[] args) 
{

	int nums[]= {1,2,3,4,5,6,7};
	int k=3;
	rotate(nums,k);

	System.out.println(Arrays.toString(nums));
}
}




	



















