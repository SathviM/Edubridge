import java.util.Scanner;
public class MinimumNumber
{
	public static void main(String[] args)
{
	int num1, num2, num3;
	Scanner scanner=new Scanner(System.in);
	
	num1=scanner.nextInt();
	num2=scanner.nextInt();
	num3=scanner.nextInt();

	if( num1<num2 && num1<num3 )
	System.out.println(" num 1 is less" +num1);
	else if(num2<num3)
	System.out.println(" num2 is less"+num2);
	else
	System.out.println(" num3 is less"+num3);
}
}
	