import java.util.Scanner;
public class Q1 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int count=0;
		int dup=n;
		while (dup!=0)
	    {
	        count++;
	        dup=dup>>1;
	    }
		System.out.println(n+" has "+count+" no.s of bits");
	}

}
