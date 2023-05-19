package conditions;

import java.util.Scanner;

public class ContVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		char a;
		System.out.println("Enter Alphabet :");
		a=sc.next().charAt(0);
		if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u') {
			System.out.println("it is vowel");
		}
		else {
			System.out.println("it is consonant");
		}
		
	}

}
