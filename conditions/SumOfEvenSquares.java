package conditions;
import java.util.Scanner;
public class SumOfEvenSquares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  nth no. of Series");
		int n=sc.nextInt(),eSum=0;
		System.out.println("Even Square Series :");
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				int even=i*i;
				eSum+=even;
				System.out.print(even+" ");
			}
			
		}
		System.out.println();
		System.out.println("The sum of above series is :"+eSum);
	
	}

}
