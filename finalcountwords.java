import java.util.HashMap;

public class finalcountwords{

	public static void main(String[] args)
	
	{
		String str="This this is is done by Saket Saket";
		
		String[] split=str.split(" ");
		
		int count=0;
		
	HashMap<String,Integer>	hm=new HashMap<>();
		for(int i=0;i<split.length;i++)
		{
			if(hm.containsKey(split[i]))
			{
				hm.get(split[i]);
				count++;
				hm.replace(split[i], count);
			}
			else
			{
		     hm.put(split[i], 1);
			}
	    }
		System.out.println(hm);
		
	}

}
