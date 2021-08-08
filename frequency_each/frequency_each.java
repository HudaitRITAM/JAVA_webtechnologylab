import java.util.Scanner;
class frequency_each {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,i;
        System.out.print("enter number of elements: ");
        n= sc.nextInt();
        int arr[]=new int[n];
        System.out.print("enter the array elements: ");
        for (i=0;i<n;i++)
         arr[i]=sc.nextInt();
         int count[]=new int[100];
         for(i=0;i<n;i++){
             count[arr[i]]++;
            }
         for(i=0;i<100;i++){
            if (count [i] !=0){
              System.out.print(i+"has frequency "+count[i]  );
            }
        }
        sc.close();
    }
}