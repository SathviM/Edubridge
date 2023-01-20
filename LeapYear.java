import java.util.Scanner;
public class Marks
{
public static void main(String[] args)
{
 Scanner scan=new Scanner(System.in); 	
System.out.println("Enter the roll number:"); 
int Rnum=scan.nextInt(); 
System.out.println("Enter the student Name:"); 
String sName=scan.next(); 
System.out.println("Enter physics mark:");
Int phyMark=scan.nextInt(); 
System.out.println("enter chemistry mark:");
 int cheMark=scan.nextInt(); 
System.out.println("enter com app mark:"); 
int comappMark=scan.nextInt();
int total=phyMark +cheMark+comappMark;
int total=phyMark +cheMark+comappMark;
int percentage=total/3; 
System.out.println(" Roll No:" + Rnum);
System.out.println("Name of Student: "+sName);
System.out.println("Mark in physics:" +phyMark);
System.out.println("Mark in chemistry: "+cheMark);
System.out.println("Mark in computer Application:"+comappMark);
System.out.println("Total Marks: "+total);
 System.out.println("percentage:"+percentage); 
System.out.println("Division=First");
}
}

