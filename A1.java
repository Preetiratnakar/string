class A1
{
public static void main(String[]args)
{
int a=4,b=2;
System.out.println("A");
try
{
System.out.println(a/b);
}
catch(ArithmeticException e)
{
System.out.println("not possible");
}
System.out.println("B");
}
}
