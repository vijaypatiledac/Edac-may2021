class A17
{
public static void main (String args[])
{

 // The two input Strings, containing the binary representation of the two values:
    String a = "10";
    String b = "11";

    // Use as radix 2 because it's binary    
    int c = Integer.parseInt(a,2);
    int d = Integer.parseInt(b,2);

    int sum = c+d;
    System.out.println(Integer.toBinaryString(sum)); 
}
}