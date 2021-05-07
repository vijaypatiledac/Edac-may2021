import java.util.*;
class A7
{
public static void main(String args[])
{
int b;
Scanner sc = new Scanner(System.in);
System.out.println("enter a no.:");

int a=sc.nextInt();
   for(int i=1;i<=10;i++)
   {
    b=a*i;
    System.out.println(a+"*"+i+"="+b);
   }
}
}