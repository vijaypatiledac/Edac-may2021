class Assgn2r5
{
    public static void main(String args[])
     {
      for(int i=1;i<=6;i++)
	{  
	   int k=i%2;
	   for(int j=1;j<=i;j++)
	      {
	        System.out.print(" ");
	      }
	   for(int j=6;j>=i;j--)
	      {
	      if(k==1)
		System.out.print("* ");
	      else
		System.out.print("* ");
	      }
	   System.out.println(" ");
	}
     
     }
}