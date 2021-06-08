import java.util.Scanner;
public class fc
{
public static void main (String[] args)
{
float c,f;
Scanner sc=new Scanner(System.in);
System.out.println("enter the fahrenheit");
f=sc.nextFloat();
c=(f-32)*5/9;
System.out.println("the celsius is"+c);
}
}
