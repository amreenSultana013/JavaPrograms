package conditions;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter the Number :");
		num=sc.nextInt();
		if(num%2==0)
			System.out.println("Number is  Even");
		else  
			System.out.println("Number is  Odd");

	}

}
