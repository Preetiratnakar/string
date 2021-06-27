import java.util.Scanner;
class Pan
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter String");
String x=sc.nextLine();
String y="";
for( int i=x.length()-1;i>=0;i--)
{
y=y+x.charAt(i);
}
if(x.equals(y))
{
System.out.println("palindrome");
}
else
{
System.out.println("not palindrome");
}
}
}
