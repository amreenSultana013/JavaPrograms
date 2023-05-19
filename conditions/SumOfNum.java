package conditions;

import java.util.Scanner;

public class SumOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the last no. till you want to add");
		int n=sc.nextInt();
		int sum=0;
		for(int i=0;i<=n;i++) {
			 
			sum=sum+i;
			 
		}
		System.out.println("The sum of "+n+" natural no. is "+sum);
		

	}

}
