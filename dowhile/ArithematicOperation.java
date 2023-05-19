package dowhile;

import java.util.Scanner;

public class ArithematicOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char c;
		do {
			System.out.println("Select an option :");
			System.out.println("1. for Addition");
			System.out.println("2. for Subtraction");
			System.out.println("3. for Multiplication");
			System.out.println("4. for Division");
			int ch=sc.nextInt();
			System.out.println("Enter 2 no.s");
			int a=sc.nextInt();
			int b=sc.nextInt();
			//char c;
			switch(ch) {
				case 1:
					System.out.println("Addition of "+a+" and "+b+" is "+(a+b));
					break;
				
				case 2:
					System.out.println("Subtraction of "+a+" and "+b+" is "+(a-b));
					break;
					
				case 3:
					System.out.println("Multiplication of "+a+" and "+b+" is "+(a*b));
					break;
				
				case 4:
					System.out.println("Division of "+a+" and "+b+" is "+(a/b));
					break;
				default: 
					System.out.println(" You have entered innvalid option " );
					break;
			}
			System.out.println("If you want to perform operation again---Press y otherwise press any key to exit");
		    c=sc.next().charAt(0);
		}while(c=='y'||c=='Y');

	}

}
