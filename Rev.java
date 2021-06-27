import java.util.Scanner;
class Rev
{
public static void main(String[]args)
{
int i;
String r=" ";
Scanner sc=new Scanner(System.in);
System.out.println("enter String");
String n=sc.nextLine();
for(i=n.length()-1;i>=0;i--)
{
r=r+n.charAt(i);
}
System.out.println("reverse="+r);
}
}
