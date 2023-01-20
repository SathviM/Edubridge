import java.util.Scanner; 
public class ArthimaticOperator
{ 
	public static void main(String[] args) 
	{ 
		int num1=0,num2=0; 
		Scanner input=new Scanner(System.in); 
		System.out.println("enter two numbers : "); 
		num1=input.nextInt(); 
		num2=input.nextInt(); 
		int sum,sub,mul,div,mod; 
		sum=num1+num2; 
		sub=num1-num2; 
		mul=num1*num2; 
		div=num1/num2; 
		mod=num1%num2; 
		System.out.println("Addition of two numbers: "+sum); 
		System.out.println("Subtraction of two numbers: "+sub); 							System.out.println("Multipliucation of two numbers: "+mul); 
		System.out.println("Division of two numbers: "+div); 
		System.out.println("modulo of two numbers: "+mod); 
	}
}
