import java.util.Scanner;
class India 
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter String");
String x=sc.nextLine();
if(x.indexOf("india")==-1)
{
System.out.println("not found");
}
else
{
System.out.println(" found");
}
}
}
