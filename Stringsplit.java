
public class Stringsplit {

	public static void main(String[] args) {
	
	String str="Hari@booma@love";
	
  String[] arr=	str.split("@",3);//2-->limit a-->Skip the character
  
  
  for(String a:arr)
  {
	  System.out.println(a);
  }
	
	
	
}
}