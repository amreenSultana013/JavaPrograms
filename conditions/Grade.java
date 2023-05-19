package conditions;
import java.util.Scanner;
public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float hin,tel,eng,math,sci,soc,total,percentage;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the marks of Hindi :");
		hin=sc.nextFloat();
		System.out.println("Enter the marks of Teluge :");
		tel=sc.nextFloat();
		System.out.println("Enter the marks of English :");
		eng=sc.nextFloat();
		System.out.println("Enter the marks of Maths :");
		math=sc.nextFloat();
		System.out.println("Enter the marks of Science :");
		sci=sc.nextFloat();
		System.out.println("Enter the marks of Social"
				+ " :");
		soc=sc.nextFloat();
		total=hin+tel+eng+math+sci+soc;
		percentage=total*100/600;
		System.out.println("Total ="+total);
		System.out.println("Percentage ="+percentage);
		if(hin<40||tel<40||eng<40||math<40||sci<40||soc<40)
			System.out.println("Fail...");
		else {
			if(percentage>80)
				System.out.println("A+");
			else if(percentage>=70)
				System.out.println("A");
			else if(percentage>=60)
				System.out.println("B");
			else if(percentage>=50)
				System.out.println("C");
			else if(percentage>=40)
				System.out.println("DS");
			else
				System.out.println("fail");
			
		}
		

	}

}
