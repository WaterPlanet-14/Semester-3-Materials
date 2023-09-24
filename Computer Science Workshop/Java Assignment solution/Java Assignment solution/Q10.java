import java.util.Scanner;
public class Q10 {
	public static int anytodecimal(int a[],int base)
	{
		int dec=0;
		if(base==16)
		{
			for(int i=0;i<a.length;i++)
			{
				dec=dec+a[i]*(int)Math.pow(16,i);
			}
		}
		else if(base==8)
		{
			for(int i=0;i<a.length;i++)
			{
				dec=dec+a[i]*(int)Math.pow(8,i);
			}
		}
		else if(base==2)
		{
			for(int i=0;i<a.length;i++)
			{
				dec=dec+a[i]*(int)Math.pow(2,i);
			}
		}
		else
		{
			for(int i=a.length-1;i>=0;i--)
			{
				dec=(dec*10)+a[i];
			}
		}
		return dec;
	}
	public static String decimaltoany(int n,int base)
	{
		int i=0,cn=0,dup=n;
		String result="";
		if(base==2)
		{
			while(dup>0)
			{
				cn=((dup%2)*((int)Math.pow(10,i)))+cn;
				dup=dup/2;
				i++;
			}
			result= Integer.toString(cn);
		}
		else if(base==8)
		{
			while(dup>0)
			{
				cn=((dup%8)*((int)Math.pow(10,i)))+cn;
				dup=dup/8;
				i++;
			}
			result= Integer.toString(cn);
		}
		else if(base==16)
		{
			while(dup>0)
			{
				cn=dup%16;
				if(cn>9)
				{
					if(cn==10)
						result= "A"+result;
					else if(cn==11)
						result="B"+result;
					else if(cn==12)
						result="C"+result;
					else if(cn==13)
						result="D"+result;
					else if(cn==14)
						result="E"+result;
					else if(cn==15)
						result="F"+result;
				}
				else
				{
					result= Integer.toString(dup%16)+result;
				}
				dup=dup/16;
			}
		}
		else
		{
			result=Integer.toString(n);
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a no.");
		String n=sc.next();
		System.out.println("Enter the i/p numbers's base");
		int nbase=sc.nextInt();
		System.out.println("Enter conversion base");
		int base=sc.nextInt();
		int a[]=new int[n.length()];
		int arrcount=0;
		if(nbase==16)
		{
			for(int i=n.length()-1;i>=0;i--)
			{
				if(n.substring(i,i+1)=="A")
					a[arrcount]=10;
				else if(n.substring(i,i+1)=="B")
					a[arrcount]=11;
				else if(n.substring(i,i+1)=="C")
					a[arrcount]=12;
				else if(n.substring(i,i+1)=="D")
					a[arrcount]=13;
				else if(n.substring(i,i+1)=="E")
					a[arrcount]=14;
				else if(n.substring(i,i+1)=="F")
					a[arrcount]=15;
				else
					a[arrcount]=Integer.parseInt(n.substring(i,i+1));
				arrcount++;
			}
		}
		else
		{
			for(int i=n.length()-1;i>=0;i--)
			{
				a[arrcount]=Integer.parseInt(n.substring(i,i+1));
				arrcount++;
				
			}
		}
		int dec=anytodecimal(a,nbase);
		System.out.println(decimaltoany(dec,base));
	}

}