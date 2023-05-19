package conditions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConVowel {

	public static void main(String[] args)throws NumberFormatException,IOException {
		// TODO Auto-generated method stub
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		
		 char a;
		System.out.println("Enter the Alphabet");
		a=bf.readLine().charAt(0);
		if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u') {
			System.out.println("it is vowel");
		}
		else {
			System.out.println("it is consonant");
		}

	}

}
