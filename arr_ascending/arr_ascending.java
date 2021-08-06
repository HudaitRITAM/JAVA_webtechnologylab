import java.util.*;
class arr_ascending
{
    public static void main(String args[])
    {
        int n,i,j,a;
        System.out.println("Enter array size");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array elements");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Array in ascending order is :");
        for (i=0;i<n;++i) 
        {
            for (j=i+1;j<n;++j)
            {
 
                if(arr[i]>arr[j]) 
                {
 
                    a=arr[i];
                    arr[i]=arr[j];
                    arr[j]=a;
                }
            }
        }
        for(i=0;i<n;i++)
        System.out.println(" " +arr[i]);
    }
}