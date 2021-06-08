import java.util.*;
public class ams
{
	public static void main (String[] args)
{
	int a,n,r=0;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	int temp=n;
		while(n>0)
		{
		a=n%10;
			n=n/10;
		r+=(a*a*a);
	
		}
			if(temp==r)
			{
			 System.out.println("the given number is ams");
			}
			 else 
			 {
			 System.out.println("it is not a ams");
			}


}
}