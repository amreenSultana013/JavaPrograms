package basic;
import java.util.Scanner;

public class Calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2, add,sub,mul,moddiv;
		float div;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		add=num1+num2;
		sub=num1-num2;
		mul=num1*num2;
		div=num1/num2;
		moddiv=num1%num2;
		System.out.println("Addition of " +num1+ " and " +num2+ " is "+add );
		System.out.println("Subtraction of " +num1+ " and " +num2+ " is "+sub );
		System.out.println("Multiplication of " +num1+ " and " +num2+ " is "+mul );
		System.out.println("Division of " +num1+ " and " +num2+ " is "+div );
		System.out.println(" Module Division of " +num1+ " and " +num2+ " is "+moddiv );

	}
}
