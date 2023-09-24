import java.util.Scanner;
public class Q14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int []a=new int[5];
		System.out.println("Enter array elements");
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		int count;
		for(int j=0;j<=9;j++)
		{
			count=0;
			for(int k=0;k<5;k++)
			{
				if(j==a[k])
				{
					count++;
				}
			}
			if(count>0)
			{
				System.out.println(j+" frequency is "+count);
			}
		}
	}

}
