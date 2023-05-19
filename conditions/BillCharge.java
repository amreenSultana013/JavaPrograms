package conditions;

import java.util.Scanner;

public class BillCharge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int ncalls,chrg;
		System.out.println("Enter the no of call :");
		ncalls =sc.nextInt();
		if(ncalls<=200) {
			chrg=ncalls*1;//per call costing Rs.1
			System.out.println("The charge of "+ncalls+" calls is Rs."+chrg);
			}
		else {
			chrg=ncalls*3;//per call costing Rs.3
			System.out.println("The charge of "+ncalls+" calls is Rs."+chrg);
		}

	}

}
