package basic;
import java.util.Scanner;
public class SimpleInterest {
	public static void main(String[] args) {
	
		int p,t,r;
		float simInt;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter principle");
		p=sc.nextInt();
		System.out.println("Enter time period");
    	t=sc.nextInt();
    	System.out.println("Enter rate of interest");
    	r=sc.nextInt();
    	simInt=(p*t*r)/100;
    	System.out.println(" Simple Interest is " +simInt);
    	 
   }
}
