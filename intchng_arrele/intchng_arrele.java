import java.util.*;
class intchng_arrele
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
        System.out.println("After inter change array elements");
        for(i=0;i<n;i++)
        {
           if(n/2!=0 && i==n-1)
           break;
           temp=arr[i];
           arr[i]=arr[(i+1)];
           arr[(i+1)]=temp;
           i++;
        }
        for(i=0;i<n;i++)
        System.out.println(" "+arr[i]);
    }
}