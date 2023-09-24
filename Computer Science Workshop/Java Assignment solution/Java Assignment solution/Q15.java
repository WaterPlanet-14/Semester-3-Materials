import java.util.Scanner;
public class Q15 {
	public static boolean prime(int num)
	{
		int c=0;
	    for (int i = 1; i<=num; ++i) 
	    {
	      if (num % i == 0) 
	      {
	        c++;
	      }
	    }
	    if(c==2)
	    	return true;
	    else
	    	return false;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array elements");
		int []a=new int[5];
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		int primecount=0;
		for(int j=0;j<5;j++)
		{
			if(prime(a[j]))
			{
				primecount++;
			}
		}
		System.out.println(primecount+" prime no.s present in the array");
	}

}
