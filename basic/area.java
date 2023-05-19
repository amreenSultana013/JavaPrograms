package basic;

import java.util.Scanner;

public class area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float l,br,r,b,h,aCir,aRect,aTri;
		System.out.println("enter the value of length and breadth of a rectangle");
		l=sc.nextFloat();
		br=sc.nextFloat();
		aRect=l*br;
		System.out.println("Area of Rectangle is "+aRect);
		System.out.println("enter the value of  radius of a circle");
		r=sc.nextFloat();
		aCir=22/7*r*r;
		System.out.println("Area of  Circle is "+aCir);
		System.out.println("enter the value of  height and base of a triangle");
		h=sc.nextFloat();
		b=sc.nextFloat();
		aTri=h*b/2;
		System.out.println("Area of Triangle is "+aTri);
	    

	}

}
