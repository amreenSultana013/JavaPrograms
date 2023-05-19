package While;

import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=sc.nextInt();
		int rem=0,numd=num,rev=0;
		System.out.print("The reverse digits of "+numd+" is : ");
		while(num>0) {
			rem=num%10;
			rev=rev*10+rem;  
			num/=10;	
		}
		System.out.print(rev);
		System.out.println();
		if(numd==rev) {
			System.out.println("The given number is palindrome");
		}
		else {
			System.out.println("The given number is not palindrome");
		}
 
	}

}
