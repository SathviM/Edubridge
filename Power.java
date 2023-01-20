import java.util.*; 
public class PowerOfNumber
{
  	public static void main(String[] args) 
	{ 
 	 	int c = 1; 
 	 	Scanner sc=new Scanner(System.in);
  	 	System.out.println("Enter the num 1:");
  	 	int num1 = sc.nextInt(); 
 	 	System.out.println("Enter the num 2:"); 
 	 	int num2 = sc.nextInt(); 
 	 	while(num2 != 0) 
		{
  	 	 	c = c *num1; 
 	 	 	num2 = num2 - 1; 
 	 	 	 
 	 	} 
 	 	System.out.println(c); 
 	} 
}