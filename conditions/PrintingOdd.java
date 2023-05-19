package conditions;

public class PrintingOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Odd no. between 25-50");
		for(int i=25;i<=50;i++) {
			if(i%2==0)
				continue;
			else {
				int odd=i;
				System.out.println(odd);
			
			}

		}

	}
}
