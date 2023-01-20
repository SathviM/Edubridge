import java.util.Scanner; 
public class DoWhile 
{
  	public static void main(String[] args) 
	{ 
 	 	int y = 0, Y =0,c=0; 
 	 	char choice; 
 	 	Scanner sc = new Scanner(System.in);  	      
		System.out.println("Enter first number : ");  	      
		int a = sc.nextInt(); 
 	      System.out.println("Enter second number : ");  	      
		int b = sc.nextInt(); 
 	      Scanner console = new Scanner(System.in); 
 	      do 
		{ 
 	    	  	c =a+b;  
 	      	System.out.print("Enter Y for yes or N for no: ");  	          
			choice = console.next().charAt(0); 
 	       } 
 	       while ((choice == 'y') || (choice == 'Y')); 
		 System.out.println("Sum of the integers: " +c); 
 	       
 	} 
 
}
