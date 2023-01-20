import java.util.Scanner;
public class Demo
{
public static void main(String[] a)
{
System.out.println("main prgm starts");
short number;
char grade;
float marks;
boolean flag=true;
int num;
num=1234;
number=90;

Scanner scanner=new Scanner(System.in);
number=scanner.nextShort();
marks=scanner.nextFloat();
flag=scanner.nextBoolean();
grade=scanner.next().charAt(0);

System.out.println(number);
System.out.println(grade);
System.out.println(flag);
}
}