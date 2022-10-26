import java.util.*;
public class removevowel {

/*	public static void main(String args[])
	
	{
		
		
		String s="love";
		
        String	s1=" ";
	
        s1=s.replaceAll("[aeiou]", "");
        System.out.println(s1);
		
		
		
	}
}*/

public static void main(String args[])
{
	String s="love";
	
    String	str="";
    
    for(int i=0;i<s.length();i++)
    {
    	if(s.charAt(i)!='a'&&s.charAt(i)!='e'&&s.charAt(i)!='i'&&s.charAt(i)!='o'&&s.charAt(i)!='u'&&
    			s.charAt(i)!='A'&&s.charAt(i)!='E'&&s.charAt(i)!='I'&&s.charAt(i)!='O'&&s.charAt(i)!='U')
    	{
    		str=str+s.charAt(i);
    	}
    	
    }
    System.out.print(str);

}

}