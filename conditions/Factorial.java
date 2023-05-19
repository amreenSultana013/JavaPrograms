package conditions;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number.");
		int n=sc.nextInt();
		int num=1;
		System.out.println("Fibonacci Series");
		for(int i=2;i<=n;i++) {
			num=num*i;
			System.out.println(num);
		}
		

	}

}
