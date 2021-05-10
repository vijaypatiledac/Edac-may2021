import java.util.*;
public class Ary4
{
 public static void main(String args[])
 {
	
	String b="abc";
	int a[]={144,140,35,15,100};
	for(int i=0;i<=a.length-2;i++)
	{
	if(a[i]<a[i+1])
	{
		if(b=="desceding")
            {
		    b="random";
			break;
			}
		else
			b="Ascending";
	}
	else
	{
          if(b=="Ascending")
            {
		    b="random";
			break;
			}
		else
		    b="desceding";
	}
	}
	System.out.println( b );
 }
}	