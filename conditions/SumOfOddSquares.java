package conditions;

import java.util.Scanner;

public class SumOfOddSquares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  nth no. of Series");
		int n=sc.nextInt(),oSum=0;
		System.out.println("Odd Square Series :");
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				continue;
			}
			else {
				int odd=i*i;
				oSum+=odd;
				System.out.print(odd+" ");
			}
			
		}
		System.out.println();
		System.out.println("The sum of above series is :"+oSum);

	}

}
