import java.util.*;
public class zigzag{
	public static void main(String[] args){
		System.out.println("Enter the size of array:");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int arr[], temp=0;
		arr=new int[n];
		System.out.println("Enter the numbers: ");
		for(int i=0; i<7; i++)
			{
				System.out.println("Enter the "+(i+1)+" number");				
				arr[i]=input.nextInt();			
			}
		System.out.println("All numbers are successfully added");
		int ary[];
		ary=new int[7];
		for(int z=0; z<(n-1); z++)	
		{
							
			else if(z%2==0)
			{
				if(arr[z]>arr[z+1])
				{
					ary[z]=arr[z+1];
					arr[z+1]=arr[z];
				}
				else
				{
					ary[z]=arr[z];
				}
			}
			else
			{
				if(arr[z]<arr[z+1])
				{
					ary[z]=arr[z+1];
					arr[z+1]=arr[z];
				}
				else
				{
					ary[z]=arr[z];
				}
			}	
		}
		System.out.println("New array is :");
		for (int i=0; i<n ; i++)
		{
			System.out.println(ary[i]+"");
		}
	}
}
