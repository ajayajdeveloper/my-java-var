import java.util.*;
public class bmi
{
public static void main(String[]args)
{
double h,w,bmi;
Scanner sc=new Scanner(System.in);
System.out.println("enter the height in inches of the person :");
h=sc.nextInt();
System.out.println("enter the weight in pounds of the perosn ");
w=sc.nextInt();
bmi=(w/(h*h))*703;
System.out.println("the bmi of the person is "+bmi);
}}
