package conditions;
import java.util.Scanner;

public class CheckingNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter the Number :");
		num=sc.nextInt();
		if(num>0)
			System.out.println("Number is positive");
		else if(num<0)
			System.out.println("Number is Negative");
		else 
			System.out.println("Number is Zero");
		

	}

}
