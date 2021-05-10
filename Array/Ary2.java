import java.util.*;
public class Ary2
{
 public static void main(String args[])
 {
	int a[]={5,14,35,89,140};
	if(a.length<3)
		System.out.print("no output");
	else
	{
	for(int i=0;i<=a.length-3;i++)
	{
		int c=0;
    for(int j=i;j<i+3;j++)
		{
		c=c+a[j];
		}	
	System.out.println("average"+c/3);
	}
	}
 }
}