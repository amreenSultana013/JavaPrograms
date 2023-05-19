package basic;

import java.util.Scanner;

public class Tax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int salary;
		float tax;
		System.out.println("Enter Salary of an Employee");
		salary=sc.nextInt();
		tax=salary*12/100;
		System.out.println("12% of employee salary " +salary+ " is: "+tax);
		

	}

}
