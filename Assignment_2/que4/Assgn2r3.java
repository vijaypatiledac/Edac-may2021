class Assgn2r3
{
    public static void main(String args[])
		{
		for(int i=1;i<=6;i++)
	{  
			for(int j=6;j>=i;j--)
			{
				if(i==j||j==6||i==1)
				   System.out.print("*");
			   else
				   System.out.print(" ");
			}
		System.out.println(" ");
	}
     
		}
}