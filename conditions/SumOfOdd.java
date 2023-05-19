package conditions;

import java.util.Scanner;

public class SumOfOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the nth No. of Series");
		int n= sc.nextInt(),osum=0;
		System.out.println("Odd Series :");
		for(int i=1;i<=n;i+=2) {
			int odd=i;
			osum+=odd;
			System.out.print(odd+" ");
		}
		System.out.println();
		System.out.println("The Sum of above Series is :"+osum);

	}

}
