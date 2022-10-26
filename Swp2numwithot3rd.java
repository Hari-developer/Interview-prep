import java.util.Scanner;

public class Swp2numwithot3rd {

	public static void main(String[] args) {
		
		
		System.out.println("Enter x and y");
		
		
	Scanner sc=new Scanner(System.in);
	
	int x=sc.nextInt();
	int y=sc.nextInt();
	
	System.out.println("After Swapping"+" "+x+" "+y);
	
	
	int temp=x;
	x=y;
	y=temp;
	
	
	System.out.println("Before Swapping"+" "+x+" "+y);
	
	}

}
