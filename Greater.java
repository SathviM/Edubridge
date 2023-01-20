import java.util.Scanner; 
public class Greater 
{ 
	public static void main(String[] args) 
	{ 
		int number; 
		String result; 
		Scanner scan = new Scanner(System.in); 
		System.out.println("Enter the number "); 
		number = scan.nextInt(); 
		result = ((number > 100) && (number > 200)) ? " the number is greater than 100 and 200" : " the number is not greater than 100 and 200"; 
		System.out.println(result); 
	} 
} 
