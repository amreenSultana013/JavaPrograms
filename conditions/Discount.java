package conditions;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		float amt,dis;
		System.out.println("Enter purchase amount :");
		 amt=sc.nextFloat();
		 if(amt<=10000) {
			 dis=amt*10/100;
			 System.out.println("You will get Rs."+dis+ " discount on this purchase");
		 }
		 else {
			 dis=amt*20/100;
			 System.out.println("You will get RS."+dis+ " discount on this purchase");
		 }

	}

}
