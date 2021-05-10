class Ary3
{
 public static void main(String args[])
 {
	int a=0;
	
	for(int i=1;i<=6;i++)
	{
		a=i%2;
		if(a==1)
		{
			System.out.println(i*i*i);
		}
		else
		{
			System.out.println(i*i);
		}
	}
 }
}	