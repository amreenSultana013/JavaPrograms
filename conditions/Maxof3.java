package conditions;
import java.util.Scanner;
public class Maxof3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter the 3 numbers i.e a,b and c :");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>b&&a>c)
			System.out.println("a is greater than b and c");
		else if(b>a&&b>c)
			System.out.println("b is greater than a and c");
		else 
			System.out.println("c is greater than a and b ");
	}

}
