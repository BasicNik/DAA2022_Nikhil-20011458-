import java.util.*;
public class rep1w0
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number=sc.nextInt();
		String str=Integer.toString(number);
		int len=str.length();
		String str1="";
		for(int i=0;i<len;i++)
		{
			if(str.charAt(i)=='0')
				str1=str1+'1';
			else
				str1=str1+str.charAt(i);
		}
		System.out.println("Converted Number is:"+str1);
		sc.close();
	}
}
