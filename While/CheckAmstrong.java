package While;

import java.util.Scanner;

public class CheckAmstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :h");
		int num=sc.nextInt();
		int n;
		int dNum=n=num,rem=0,count=0;
		int sum=0;
		System.out.print("The no. of digits in a number is : ");
		while(num>0) {
			 num=num/10;
			 count++;
		}
		System.out.println(count);
		 
		while(n>0){
			rem=n%10;
			sum=(int) (sum+Math.pow(rem,count));
			n=n/10;
		} 
		System.out.println("The Sum of digits raise to their power is "+sum);
		if(sum==dNum) {
			System.out.println("The given no. "+dNum+" is Armstrong Number");
		}
		else {
			System.out.println("The given no. "+dNum+" is not Armstrong Number");
		}

	}

}
