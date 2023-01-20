import java.util.Scanner; 
public class PrimeNumber
{ 
 	public static void main(String[] args)
	{ 
 	 	int num=0; 
        	Scanner s = new Scanner(System.in); 
 	 	System.out.print(" Enter any Number : "); 
 	 	int number = s.nextInt();  	 	
		int m = number/2;  	 	
		if(number ==0||number == 1) 
		{ 
   			System.out.println(number+"is not Prime number"); 
 	 	}
		else 
		{ 
 	 	 	for(int i=2;i<=m;i++) 
			{
  	 	 	 	if(number%i==0) 
				{ 
 	 	 	 	 	System.out.println(number+"is Not prime"); 
 	 	 	 	 	num = 1; 
 	 	 	 	 	break; 
 	 	 	 	} 
 	 	 	 	 
 	 	 	} 
 	 	 	 
 	 	 	if(num == 0) 
			{ 
 	 	 	 	System.out.println(number+"is prime number"); 
 	 	 	} 
 	 	} 
 	 	 
 	} 
 
}
