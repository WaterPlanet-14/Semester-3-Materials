import java.util.Scanner;
public class Q13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no.");
		int n=sc.nextInt();
		int dup,d,count;
		for(int i=0;i<=9;i++)
		{
			count=0;
			dup=n;
			while(dup>0)
			{
				d=dup%10;
				if(i==d)
				{
					count++;
				}
				dup=dup/10;
			}
			if(count>0)
			{
				System.out.println(i+" frequency of is "+count);
			}
		}

	}

}
