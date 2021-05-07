import java.util.Scanner;
public class A19
{
public static void main(String args[])
{
 ;
Scanner sc = new Scanner(System.in);

System.out.print("Decimal No :");
int dec_num = sc.nextInt();
int bin_num[]= new int[32];
int quot = dec_num;
int i=0;
while(quot != 0)
{
   bin_num[i]= quot % 2;
   quot = quot/2;
   i++;
}
 System.out.println("Binary No :");
 for(int j=i-1; j>=0; j--)
{ 
  System.out.print(bin_num[j]);
}
  
}


}