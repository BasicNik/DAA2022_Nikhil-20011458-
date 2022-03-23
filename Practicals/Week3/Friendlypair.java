import java.util.*;
public class main{

	public static void main(String[]args){
	Scanner cs=new Scanner(System.in);
	int num1,num2,i;
		System.out.println("Enter the First Number : ");
		num1=cs.nextInt();
		System.out.println("Enter the Second Number : ");
		num2=cs.nextInt();
		int sum1=0;
		int sum2=0;
		for(i=1;i<num1;i++)
		{
			if(num1%i==0)
			{
			sum1=sum1+i;
			}
		}
		for(i=1;i<num2;i++)
		{
			if(num2%i==0)
			{
			sum2=sum2+i;
			}
		}
		if((double)num1/sum1==(double)num2/sum2)
		System.out.println("It is a friendly pair");
		else
		System.out.println("It is not a friendly pair");
		System.out.println("First Number: " + num1+"\n"+"Second Number: " + num2+"\n"+"Sum1:" + sum1+"\n"+"Sum2:" + 			sum2+"	");
		cs.close();
	}
}





