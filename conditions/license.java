package conditions;
import java.util.Scanner;
public class license {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Age :");
		age=sc.nextInt();
		if(age>=18)
			System.out.println(" License is Permitted");
		else
			System.out.println(" Licence is not permittedS");
	}

}
