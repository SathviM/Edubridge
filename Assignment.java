import java.util.Scanner; 
public class Assignment
{ 
	public static void main(String[] args)
	{ // TODO Auto-generated method stub 
	int num1,num2; 
	Scanner sc = new Scanner(System.in); 
	System.out.println("Enter the first number: "); 
	num1=sc.nextInt(); 
	System.out.println("Enter the second number: "); 
	num2=sc.nextInt(); 
	System.out.println(num1+" < "+num2+(num1<num2)); 
	System.out.println(num1+" > "+num2+(num1>num2)); 
	System.out.println(num1+" <= "+num2+(num1<=num2)); 
	System.out.println(num1+" >= "+num2+(num1>=num2)); 
	System.out.println(num1+" != "+num2+(num1!=num2)); 
	System.out.println(num1+" == "+num2+(num1==num2)); 
	} 
} 
