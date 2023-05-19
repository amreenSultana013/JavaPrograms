package conditions;

import java.util.Scanner;

public class TypeOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number: ");
		
		int num=sc.nextInt();
		System.out.println("Select the option ");
		System.out.println("1. for checking the no. even or odd ");
		System.out.println("2. for checking the no. +ve,-ve, or zero ");
		int ch=sc.nextInt();
		switch(ch) {
			case 1:
				if(num%2==0)
					System.out.println("Your no. is even");
				else
					System.out.println("Your no. is odd");
			break;
			
			case 2:
				if(num>0)
					System.out.println("Your no. is positive");
				else if(num<0)
					System.out.println("Your no. is negative");
				else
					System.out.println("Your no. is Zero");
			break;
			default:
				System.out.println("invalid Choice");
			
		}

	}

}
