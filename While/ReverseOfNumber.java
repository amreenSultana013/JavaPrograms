package While;

import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=sc.nextInt();
		int rem=0,numd=num;
		System.out.print("The reverse digits of "+numd+" is : ");
		while(num>0) {
			rem=num%10;
			 System.out.print(rem); 
			num/=10;	
		}
		 
	}

}
