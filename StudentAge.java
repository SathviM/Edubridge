import java.util.Scanner; 
public class StudentAge 
{ 
	public static void main(String[] args) 
	{ // TODO Auto-generated method stub 
		int age; 
		Scanner sc=new Scanner(System.in); 
		do 
		{ 
			System.out.println("Enter the age of the student: "); 
			age=sc.nextInt(); 
		}while(age==18 && age<=18); 
		System.out.println("Age is >= 18");  
	} 
}
