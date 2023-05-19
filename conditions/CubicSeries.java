package conditions;

import java.util.Scanner;

public class CubicSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the last no. of Series");
		int n=sc.nextInt(),cSum=0;
		System.out.print("Perfect Cubes are : ");
		for(int i=1;i<=n;i++) {
			int cub;
			cub=i*i*i;
			cSum+=cub;
			System.out.print(cub+" ");
		}
		System.out.println();
		System.out.println("The Sum of above Cubes is :"+cSum);

	}

}
