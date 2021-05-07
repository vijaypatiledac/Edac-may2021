import java.util.Scanner;
public class A22
{
public static void main(String args[])
{
  Scanner sc = new Scanner(System.in);
  long binaryno,decimalno=0;
  long j=1,r;
  System.out.print("Binary no :");
  binaryno = sc.nextLong();
  

while(binaryno != 0)
{
  r = binaryno % 10;
  decimalno = decimalno + r * j;
  j = j*2;
  binaryno = binaryno/10;
}
 System.out.println("Decimal No :"+ decimalno);
 
}
  
}