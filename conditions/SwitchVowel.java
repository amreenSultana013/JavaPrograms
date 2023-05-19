package conditions;

import java.util.Scanner;

public class SwitchVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int choice;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Alphabet:");
		char ch=sc.next().charAt(0);
		switch (ch) {
			case 'a':
			case 'e':
			case 'i':	  
			case 'o':	 
			case 'u':
				System.out.println(ch+" is a vowel");
			break;
		 
			default:
				System.out.println(ch+" is a consonant");
			break;
		
		}

	}

}
