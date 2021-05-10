import java.util.*;

class Ary5

{

public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	int a[]=new int[7];
	System.out.println("M1");
	for(int i=0;i<7;i++)//Row
	{
			a[i]= sc.nextInt();
		System.out.println();
	}
	int max=a[0];
	int max1=a[0];
	int max2=a[0];
	for(int i=1;i<7;i++)//Row
	{
		    if (max<a[i])
				{
				max2=max1;
				max1=max;
				max=a[i];
				}
			else
			{   max=max;
				if(max1<a[i])
				{
					max2=max1;
					max1=a[i];
					
				}
				else
				{
					max1=max1;
					if(max2<a[i])
				       max2=a[i];
				    else
					   max2=max2;
						
				} 
			}
		
	}
	System.out.println("max="+max);
	System.out.println("max1="+max1);
	System.out.println("max2="+max2);

}
}