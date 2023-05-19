package basic;
import java.util.Scanner;
public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int sub1,sub2,sub3,total;
		float percent;
		System.out.println("Enter the marks of 3 Subject :");
		sub1=sc.nextInt();
		sub2=sc.nextInt();
		sub3=sc.nextInt();
		total=sub1+sub2+sub3;
		percent=(total*100)/300;
		System.out.println("Percentage of 3 sub is : "+percent);
		
		

	}

}
