import java.util.*;
public class A6
{
 public static void main(String args[])
 {
	Scanner sc= new Scanner(System.in);
    int a,b,c,d,e,f,g;
	System.out.println("input first no");
	a=sc.nextInt();
	System.out.println("input first no");
	b=sc.nextInt();
	c=a+b;
	d=a-b;
	e=a*b;
	f=a/b;
	g=a%b;
	
	System.out.println(a+"+"+b+"="+c);
	System.out.println(a+"-"+b+"="+d);
	System.out.println(a+"*"+b+"="+e);
	System.out.println(a+"/"+b+"="+f);
	System.out.println(a+"mod"+b+"="+g);

 }
}