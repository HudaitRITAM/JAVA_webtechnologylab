import java.util.*;
class swap_arr
{
     public static void main(String args[])
    {
        int n,i,j,temp;
        System.out.println("Enter array size");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array elements");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Afterswaping array elements ");
        for(i=0;i<n/2;i++)
        {
           temp=arr[i];
           arr[i]=arr[n-(i+1)];
           arr[n-(i+1)]=temp;
        }
        for(i=0;i<n;i++)
        System.out.println(" "+arr[i]);
    }
}