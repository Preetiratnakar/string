import java.util.Scanner;
class Str2
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter name");
String x=sc.nextLine();
String y="";
int i;
for(i=0;i<x.length();i++)
{
char ch=x.charAt(i);
if(y.indexOf(ch)==-1)
y=y+ch;
}
System.out.println(y);
}
}
