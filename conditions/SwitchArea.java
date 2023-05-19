package conditions;

import java.util.Scanner;

public class SwitchArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Choice.");
		System.out.println("1. For area of Circle.");
		System.out.println("2. For area of Triangle.");
		System.out.println("3. For area of Rectangle.");
		int ch=sc.nextInt();
		switch(ch) {
			case 1:
				System.out.println("Enter radius of circle");
				float r=sc.nextFloat();
				float acir=22/7*r*r;
				System.out.println("Area of a Circle is: "+acir);
				break;
				
			case 2:
				System.out.println("Enter  base of Triangle");
				float bs=sc.nextFloat();
				System.out.println("Enter height of Triangle");
				float h=sc.nextFloat();
				float atri=bs*h/2;
				System.out.println("Area of a  Triangle is: "+atri);
				break;
				
			case 3:
				System.out.println("Enter length of Rectangle");
				float l=sc.nextFloat();
				System.out.println("Enter  Breadth of Rectangle");
				float b=sc.nextFloat();
				float arec=l*b;
				System.out.println("Area of a Rectangle is: "+arec);
				break;
				
			/*case 1:
				System.out.println("Enter radius of circle");
				float r=sc.nextFloat();
				float acir=22/7*r*r;
				System.out.println("Area of a Circle is: "+acir);
				break;
				*/
			default:
				System.out.println("Invalid choice");
				break;
		}

	}

}
