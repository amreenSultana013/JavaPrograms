package conditions;

public class SumOfEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sum of even no. between 1-50 is ");
		int even=0;
		for(int i=1;i<=50;i++) {
			if(i%2==0)
				even=even+i;
		}
		System.out.print(even);

	}

}
