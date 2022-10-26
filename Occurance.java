import java.util.HashMap;

public class Occurance
{
	public static void main(String[] args)
	{
		String str="Protechsoft";
		
		HashMap<Character,Integer> hm=new HashMap<>();
		int count=0;
		
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			
			if(hm.containsKey(str.charAt(i)))
			{
				hm.get(str.charAt(i));
				count++;
				hm.replace(str.charAt(i),count);
			}
			else
			{
				hm.put(str.charAt(i), 1);
			}
		}
		System.out.println(hm);
	}

}

