import java.util.Scanner; 
public class ReverseNumber
{
  	public static void main(String[] args) 
	{ 
 	 	int rev =0; 
 	 	Scanner s=new Scanner(System.in);
  	 	System.out.println("Enter the number:"); 
 	 	int num = s.nextInt(); 
 	 	while(num !=0) 
		{ 
 	 	 	int result = num%10;
  	 	 	rev = rev * 10 + result; 
 	 	 	num=num/10;  
 	 	} 
 	 	System.out.println(rev); 
 	} 
 
} 
