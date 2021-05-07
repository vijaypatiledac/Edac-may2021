import java.lang.*;
import java.util.*;
class A15
{
  public static void main(String args[])
 {
    Scanner sc= new Scanner (System.in);
    System.out.print("Enter the two no : ");
	
    int a = sc.nextInt();
    int b = sc.nextInt();
	//int temp;

    System.out.println("a: "+a);
    System.out.println("b: "+b);
	
	a= b-(-a);
    b= a-b;
	a= a-b;

    System.out.println("After Swapping : ");
    System.out.println("a: "+a);
    System.out.println("b: "+b);
 }
}


