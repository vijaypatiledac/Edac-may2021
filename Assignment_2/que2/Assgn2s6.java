class Assgn2s6

{
    public static void main(String args[])
     {
      for(int i=1;i<=5;i++)
	{
	   for(int j=1;j<=i;j++)
	      {
		System.out.print(" ");
	      }
	   for(int j=9;j>=(2*i)-1;j--)
	      {
		System.out.print("*");
	      }
	   System.out.println(" ");
	}
     
     }
}