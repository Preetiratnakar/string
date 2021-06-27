import java.util.Scanner;
class Palind
{
public static void main(String[]args)
{
Scanner sc=new Scanner (System.in);
System.out.println("enter string");
String x=sc.next();
String[]y=x.split(",");
for(int i=0;i<y.length;i++)
{
StringBuffer sb=new StringBuffer(y[i]);
sb.reverse();
String p=sb.toString();
if(p.equals(y[i]))
{
System.out.println(p);
}
}
}
}
