package conditions;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number.");
		int n=sc.nextInt();
		int num1=0;
		int num2=1;
		System.out.println("Fibonacci Series"); 
		System.out.println(num1);
		System.out.println(num2);
		for(int i=1;i<=n;i++) {
			int num3=num1+num2; 
			System.out.println(num3);
			num1=num2;
			num2=num3;	
		}
	}
}
