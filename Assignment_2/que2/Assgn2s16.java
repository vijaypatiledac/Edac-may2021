class Assgn2s16
{
    public static void main(String args[])
     {
      for(int i=1;i<=5;i++)
	{
	   for(int j=4;j>=i;j--)
	      {
		System.out.print(" ");
	      }
	   for(int j=1;j<=i;j++)
	      {
		 if(i==5||j==i||j==1)
		      System.out.print("*");
		  else
		      System.out.print(" ");
	      }
	   System.out.println(" ");
	}
	for(int i=1;i<=5;i++)
	{  
	   int k=i%2;
	   for(int j=5;j<=i;j++)
	      {
	        System.out.print(" ");
	      }
	   for(int j=5;j<=i;j--)
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