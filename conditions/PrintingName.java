package conditions;

import java.util.Scanner;

public class PrintingName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name :");
		String name;
		name=sc.nextLine();
		for(int i=1;i<=5;i++)
			System.out.println(name);
		
	}

}
