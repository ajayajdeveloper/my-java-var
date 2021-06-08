import java.util.*;
public class mintoyd
{
public static void main(String[] args)
{
int a,year,min,day;
Scanner sc=new Scanner(System.in);
System.out.println("enter the minutes to be calculated");
min=sc.nextInt();
a=min;
year=min/525600;
day=(min/1440)-year*365;
System.out.println(+a+"mintues is approx"+year+"years and "+day+"days");


}}
