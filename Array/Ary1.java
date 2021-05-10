import java.util.*;
public class Ary1
{
 public static void main(String args[])
 {
	int a[]={23,60,90,3,102};
	int b[]={42,16,74};
	int c[]=new int[8];
    for(int i=0;i<8;i++)
		{
		if (i<5)
		c[i]=a[i];
		else
		c[i]=b[i-5];
		}	
	for(int i=0;i<8;i++)
		{
		System.out.print(c[i]+" ");
		}
 }
}