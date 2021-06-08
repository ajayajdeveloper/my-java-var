import java.util.*;
public class dist
{
public static void main (String[] args)
{
double d,h,m,sec,tsec,ms,km,mh;
Scanner sc=new Scanner(System.in);
System.out.println("enter the distance in meter");
d=sc.nextInt();
System.out.print("enter hour");
h=sc.nextInt();
System.out.println("enter min");
m=sc.nextInt();
System.out.println("enter sec");
sec=sc.nextInt();
tsec=h*60*60+m*60+sec;
ms=d/tsec;
km=(d/1000)/tsec*60*60;
mh=km/1.609;
System.out.println("enter the meter/second"+ms);
System.out.println("enter the km/h"+km);
System.out.println("enter the miles"+mh);
}}

