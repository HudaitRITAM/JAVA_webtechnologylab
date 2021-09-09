import java.util.*; 
public class Pattern_4
{
    public static void main(String[] args) {
        int i,j,k;
        int space = 2;
        for(i=1; i<=4; i++){
            for(k=space;k>=0;k--){
                System.out.print(" ");
            }
            space--;
            for(j = 1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}