class A18
{
public static void main (String args[])
{

 // The two input Strings, containing the binary representation of the two values:
    String a = "010";
    String b = "011";

    // Use as radix 2 because it's binary    
    int c = Integer.parseInt(a,2);
    int d = Integer.parseInt(b,2);

    int sum = c*d;
    System.out.println(Integer.toBinaryString(sum)); 
}
}