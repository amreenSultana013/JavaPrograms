package While;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=sc.nextInt();
		int sum=0,rem=0,numd=num;
		while(num>0) {
			rem=num%10;
			sum+=rem;
			num/=10;	
		}
		System.out.println("The sum of digits of "+numd+" is : "+sum );
		

	}

}
