import java.util.Scanner;
public class Q11 {
	public static String reverse(String s)
	{
		String rs="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rs=rs+s.substring(i,i+1);
		}
		return  rs;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String s=sc.nextLine();
		String [] words = s.split(" ");
		s="";
		for(int i=0;i<words.length;i++)
		{
			s=s+reverse(words[i])+" ";
		}
		System.out.println(s);
	}

}
