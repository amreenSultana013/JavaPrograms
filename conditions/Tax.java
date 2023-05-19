package conditions;
import java.util.Scanner;
public class Tax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		float salary,tax;
		System.out.println("Enter your Salary :");
		salary=sc.nextFloat();
		if(salary<=50000) {
			tax=salary*10/100;
			System.out.println("The 10% tax of Salary is : "+tax);
		}
		else {
			tax=salary*15/100;
			System.out.println("The 15% tax of Salary is : "+tax);
		}
			

	}

}
