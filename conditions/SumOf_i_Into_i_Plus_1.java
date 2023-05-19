package conditions;

import java.util.Scanner;

public class SumOf_i_Into_i_Plus_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the nth No. of series :");
		int n=sc.nextInt(),psum=0;
		for(int i=1;i<=n;i++){
			int pro=i*(i+1);
			psum+=pro;
			System.out.print(i+"*"+(i+1)+" + ");
			
		}
		System.out.println("= "+psum);

	}

}
