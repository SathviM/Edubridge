import java.util.Scanner; 
public class SameOrNot 
{ 
	public static void main(String[] args) 
	{ // TODO Auto-generated method stub 
		int num1; 
		int num2; 
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter a number: "); 
		num1=sc.nextInt(); 
		System.out.println("enter another number: "); 
		num2=sc.nextInt(); 
		while(num1==num2) 
		{ 
			System.out.println("Both the numbers are same"); 
			break; 
		} 
		while(num1!=num2) 
		{ 
			System.out.println("Both the numbers are different"); 
			break; 
		} 
	}
}
