import java.util.*;
public class stud_grade 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int m;
		System.out.println("Enter the marks");
		m=sc.nextInt();
		if(m<=100&&m>91)
		System.out.println("O GRADE");
		else if(m>81&&m<=90)
		System.out.println("E GRADE");
		else if(m>71&&m<=80)
		System.out.println("A GRADE");
		else if(m>61&&m<=70)
		System.out.println("B GRADE");
		else if(m>51&&m<=60)
		System.out.println("C GRADE");
		else if(m>41&&m<=50)
			System.out.println("D GRADE");
		else
		System.out.println("FAIL");
	}
}