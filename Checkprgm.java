import java.util.Scanner;
public class Checkprgm 
{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter the any character:");
char ch=scan.next().charAt(0);
if((ch>='a' && ch<='z') ||(ch>='A' && ch<='Z') )
{
System.out.println(ch +"is alphabet");
}
else if(ch>='0' && ch<='9' ) 
{
System.out.println(ch+ "is number");
}
else
{
System.out.println(ch+"is Spacial character:");
}
}
}
