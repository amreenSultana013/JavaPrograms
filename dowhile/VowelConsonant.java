package dowhile;

import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char c;
		do {
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
			System.out.println("Press y to continue otherwise any key to exit");
			c=sc.next().charAt(0);
		}while(c=='y'||c=='Y');


	}

}
