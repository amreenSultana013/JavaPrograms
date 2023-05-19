package conditions;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. which you want a table for:");
		int n=sc.nextInt();
		for(int i=1;i<=10;i++) {
			int num=n*i;
			System.out.println(n+" * " +i+ " = "+num);  
		}
		

	}

}
