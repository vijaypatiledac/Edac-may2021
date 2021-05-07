class Assgn2c10
{
    public static void main(String args[])
     {
	 char a='E';
      for(int i=1;i<=5;i++)
	{  
	   int k=i%2;
	   for(int j=5;j>=i;j--)
	      {
	        System.out.print(" ");
	      }
		  char b=a;
	   for(int j=1;j<=i;j++)
	      {
	      if(k==1)
		System.out.print(b+" ");
	      else
		System.out.print(b+" ");
		b++;
	      }
	   System.out.println(" ");
	   a--;
	}
     
     }
}