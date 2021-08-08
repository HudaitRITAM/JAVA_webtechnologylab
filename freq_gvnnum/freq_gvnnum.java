import java.util.*;
class freq_gvnnum
{
    public static void main(String args[])
    {
        int n,i,f,count=0;
        System.out.println("Enter array size");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array elements");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number to find frequency of ");
        f=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(arr[i]==f)
            count++;
        }
        System.out.println("Number is present in array " +count+ "  times");
    }
    
}