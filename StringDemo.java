import java.util.Scanner;
class StringDemo
{
public static void main(String[]args)
{
Scanner sc= new Scanner(System.in);
System.out.println("enter string");
String x=sc.nextLine();

int i;
for(i=0;i<x.length();i++)
{
System.out.println(x.charAt(i));
}
}
}