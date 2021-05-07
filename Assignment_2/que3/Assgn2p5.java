class Assgn2p5
{
    public static void main(String args[])
     { int b=9;
      for(int i=1;i<=9;i++)
	{
	   for(int j=8;j>=i;j--)
	      {
		System.out.print(" ");
	      }
		 
		  int c=b;
	   for(int j=1;j<=i;j++)
	      {
		System.out.print(c);
		c++;
	      }
		  int a=8;
		  for(int j=1;j<=i-1;j++)
	      {
		System.out.print(a);
		a--;
	      }
		  b--;
	   System.out.println(" ");
	}
     
     }
}