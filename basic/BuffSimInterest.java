package basic;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BuffSimInterest {

	public static void main(String[] args) throws NumberFormatException,IOException{
		int p,t,r;
		float simInt;
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		// TODO Auto-generated method stub
		System.out.println("Enter principle :");
		p= Integer.parseInt(reader.readLine());
		System.out.println("Enter time period :");
		t= Integer.parseInt(reader.readLine());
		System.out.println("Enter rate of Interest :");
		r= Integer.parseInt(reader.readLine());
		simInt=(p*t*r)/100;
		System.out.println("Simple Interest is "+simInt);
		 

	}

}
