
public class Sequence{
	
	
	   long  getsequence(int i,int j,int k)
	{
		int s=0,a;
		for(a=i;a<=j;a++)
		{
			s+=a;
		}
		for( a=j-1;a>=k;a--)
		{
			s+=a;
		}
		return s;
		
	}
	public static void main(String[] args)
	
	{
		Sequence val=new Sequence()	;
		
		System.out.println(val.getsequence(7,9,8));
	}

}
