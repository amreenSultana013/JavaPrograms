package conditions;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the No. :");
		int num=sc.nextInt();
		if(num==0||num==1)
			System.out.println(num+" is not a prime no.");
		else {
			for(int i=2;i<=num;i++) {
				if(num%i==0) {
			
					System.out.println(num+" is a not prime no.");
					break;
				}
				else 
					System.out.println(num+" is a prime no.");
			}
		}
	}

}
