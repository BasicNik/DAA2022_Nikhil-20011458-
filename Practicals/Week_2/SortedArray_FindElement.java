import java.util.Scanner;
public class Main
{
    static int countOccurrences(int arr[], int n, int x)
    {
        int res = 0;
        for (int i=0; i<n; i++)
            if (x == arr[i])
              res++;
        return res;
    }
    public static void main(String[] args) 
    {
        int n, x,flag=0,f=0, i = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        System.out.print("Enter the element you want to find:");
        x = s.nextInt();
        System.out.println("No. of occurence :" + countOccurrences(a, n, x));
    }
}
