
public class Anitha {

	public static void main(String[] args) {

		String str="Anitha";
         String str1=str.substring(0,3);
         String str2=str.substring(3,6);

        
       int j=str2.length()-1;
       String a="";
       
       for(int i=str1.length()-1;i>=0;i--)
       {
    	   a=a+str1.charAt(i)+" "+str2.charAt(j)+" ";
    	   j--;
       }
       System.out.println(a);
}
}
