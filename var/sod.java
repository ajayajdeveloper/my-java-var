import java.util.*;
public class sod
{
public static void main(String[]args)
{int i,c=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
i=sc.nextInt();
while(i!=0)
{
c=c+(i%10);
i=i/10;
}
System.out.println("the sum is "+c);
}}
