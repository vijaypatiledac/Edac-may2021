class Assgn2c9
{
    public static void main(String args[])
     {
	  
      for(int i=1;i<=5;i++)
	{  			  char star='A';

	   int k=i%2;
	   for(int j=5;j>=i;j--)
	      {
	        System.out.print(" ");
	      }
	   for(int j=1;j<=i;j++)
	      {
	      if(k==1)
		System.out.print(star+" ");
	      else
		System.out.print(star+" ");
	   star++;
	      } 
		  
	   System.out.println(" ");
	}
     
     }
}