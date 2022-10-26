
public class Swapping {

	public static void main(String[] args) 
	{
        int a=30;
        int b=20;
        Swapnumbers(a,b);
        System.out.printf("a is %d, b is %d", a, b);//format string method  (out.format(format, args))
        

        
	}

	
	public static void  Swapnumbers(int a, int b)
	{

		b=b+a;
		a=b-a;
		b=b-a;
		
	}
}
