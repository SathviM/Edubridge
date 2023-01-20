import java.util.*; 
public class Factorial
{
  	public static void main(String[] args) 
	{ 
 	 	int a =1; 
 	 	System.out.println("Enter the number:"); 
 	 	Scanner sx=new Scanner(System.in); 
 	 	int num = sx.nextInt(); 
 	 	for(int i=1;i<=num;i++) 
		{  	 
 	 	 	a=a*i; 
  	 	} 	 
 		System.out.println("Factoril value of "+num+" is = "+a);
 	 } 
 	 
}
