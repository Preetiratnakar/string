import java.util.Scanner;
class Palin
{
public static void main(String[]args)
{
Scanner sc=new Scanner (System.in);
System.out.println("enter string");
String x=sc.next();

StringBuffer sb=new StringBuffer(x);
sb.reverse();
String p=sb.toString();
if(x.equals(p))
{
System.out.println("palin");
}
else
System.out.println("not palin");
}
}
