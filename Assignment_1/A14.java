class A14

{
    public static void main(String args[])
    {
       int i, j,c;
       for(i=1;i<=9;i++)
       {
         
             c=i%2;
	     if(c==1)
                {
                   for(j=1;j<=6;j++)
                   { 
	           System.out.print("* ");
                   }
                   for(j=1;j<=30;j++)
                   { 
	           System.out.print("=");
                   }
                 }
	      else
		 {
                   for(j=1;j<=5;j++)
                   { 
	           System.out.print(" *");
                   }
		   System.out.print("  ");
                   for(j=1;j<=30;j++)
                   { 
	           System.out.print("=");
                   }

		 }
           System.out.println(" ");
       } 
           
                   for(i=1;i<=6;i++)
                   { 
                       for(j=1;j<=42;j++)
                       { 
	               System.out.print("=");
                        } 
		        System.out.println(" ");
                   }    
    }
}