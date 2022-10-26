
public class stringContainsVowels {

	public static void main(String[] args) 
	{
		System.out.println(stringContainsVowels("Hari"));
		System.out.println(stringContainsVowels("Mln"));
		

	}
	
	public static Boolean stringContainsVowels(String input)
	{
		
		return input.toLowerCase().matches(".*[aeiou].*");//If u check any values inside the matches(string regex)
		
		
	}

}
