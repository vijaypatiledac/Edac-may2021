class Assgn2r6
{
    public static void main(String args[])
     {
      for(int i=1;i<=4;i++)
	{  
	   int k=i%2;
	   for(int j=4;j>=i;j--)
	      {
	        System.out.print(" ");
	      }
	   System.out.print("*");
	   for(int j=1;j<i;j++)
	      {
	        System.out.print(" ");
	      }
	   for(int j=2;j<i;j++)
	      {
	        System.out.print(" ");
	      }
           if(i>1)
              System.out.println("*");
           else
              System.out.println(" ");
	}
           for(int h=1;h<=5;h++)
	      {
	        System.out.print("* ");
	      }
     
     }
}