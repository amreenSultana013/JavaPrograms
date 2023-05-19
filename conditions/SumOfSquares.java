package conditions;

import java.util.Scanner;

public class SumOfSquares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the last no. of Series");
		int n=sc.nextInt(),sum=0;
		System.out.print("Perfect Squares : ");
		for(int i=1;i<=n;i++) {
			int sqr;
			sqr=i*i;
			sum+=sqr;
			System.out.print(sqr+" ");
		}
		System.out.println();
		System.out.println("The Sum of above Squares is :"+sum);

	}

}
