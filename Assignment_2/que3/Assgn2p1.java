class Assgn2p1
{
    public static void main(String args[])
     {
      for(int i=1;i<=9;i++)
	{  
	   int k=i%2;
	   for(int j=9;j>=i;j--)
	      {
	        System.out.print(" ");
	      }
	   for(int j=1;j<=i;j++)
	      {
	      if(k==1)
		System.out.print(i+" ");
	      else
		System.out.print(i+" ");
	      }
	   System.out.println(" ");
	}
     
     }
}