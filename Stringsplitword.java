
public class Stringsplitword {

	public static void main(String[] args) {
		
			String str="Hari not love booma";
			
		  String[] arr=	str.split("not");//not-->Skip the Word.
		  
		  
		  for(String a:arr)
		  {
			  System.out.print(a);
		  }
			
		}
		
	}

