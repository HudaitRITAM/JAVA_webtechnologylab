import java.util.*;
class duplicate_data
{
    public static void main(String args[])
    {
        System.out.println("Enter array size");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        boolean a[] = new boolean[n];
        System.out.println("Enter array elements");
        for(int i=0 ; i<n ; i++)
        {
            arr[i]=sc.nextInt();
            a[arr[i]]=false;
        }
        System.out.println("Non-Duplicate Elements");
        for(int i=0 ; i<n ; i++)
        {
            int count=1;
            for(int j=i+1 ; j<n ; j++)
            {
                if(arr[i]==arr[j] && a[arr[i]]==false)
                count++;
            }
            if(a[arr[i]]==false)
            {
                System.out.println(arr[i]);
                a[arr[i]]=true;
            }
        }
    }
}