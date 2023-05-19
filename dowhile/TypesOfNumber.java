package dowhile;

import java.util.Scanner;

public class TypesOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char c;
		 do {
			 System.out.println("Enter the number");
			 int num=sc.nextInt();
			 //even or odd
			 if(num%2==0) {
				 System.out.println("it is even no.");
			 }
			 else {
				 System.out.println("it is odd");
			 }
			 // positive,negative,zero
			 if(num>0)
				 System.out.println("it is positive");
			 else {
				 if(num<0)
					 System.out.println("it is negative");
				 else
					 System.out.println("it is Zero");
			 }
			 //palindrome
			 int dNum=num,rem=0,rev=0;
			 while(dNum>0) {
				 rem=num%10;
				 rev=rev*10+rem;
				 dNum/=10;
			 }
			 if(rev==num)
				 System.out.println("It is palindrome");
			 else
				 System.out.println("it is not palindrome");
			 //Armstrong no.
			 int cop=num,count=0,sum=0,rem2=0;
			 while(cop>0) {
				 cop=cop/10;
				 count++;
			 }
			 int n=num;
			 while(n>0) {
				 rem2=n%10;
				 sum=(int) (sum+(Math.pow(rem2, count)));
				 n=n/10; 
			 }
			 if(sum==num)
				 System.out.println("it is an Armstrong Number");
			 else
				 System.out.println("it is not an Armstrong Number");
			 System.out.println("Press c to Continue otherwise any key to exit");
			 c=sc.next().charAt(0);
			 
		 }while(c=='c'||c=='C');
		
	}

}
