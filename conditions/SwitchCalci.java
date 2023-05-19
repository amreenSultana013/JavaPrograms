package conditions;

import java.util.Scanner;

public class SwitchCalci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1,n2;
		System.out.println("Enter numbers to perform operations");
		n1=sc.nextInt();
		n2=sc.nextInt();
		
		System.out.println("Enter Your Choice :");
		System.out.println("+ : Addition");
		System.out.println("- : Subtaction");
		System.out.println("* : Addition");
		System.out.println("/ : division");
		char ch=sc.next().charAt(0);
		switch(ch) {
			case '+':
				int add=n1+n2;
				System.out.println("Addition of "+n1+ " and " +n2+" is " +add);
				break;
				
			case '-':
				int sub=n1-n2;
				System.out.println("Addition of "+n1+ " and " +n2+" is" +sub);
				break;
				
			case '*':
				int mul=n1*n2;
				System.out.println("Addition of "+n1+ " and " +n2+" is " +mul);
				break;
				
			case '/':
				int div=n1/n2;
				System.out.println("Addition of "+n1+ " and " +n2+" is " +div);
				break;
				
			default:
				System.out.println("invalid choice");
		}

	}

}
