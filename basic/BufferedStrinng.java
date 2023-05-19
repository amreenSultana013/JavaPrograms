package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedStrinng {

	public static void main(String[] args) throws NumberFormatException,IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String");
		  String ch=br.readLine();
		  //Showing Error read()-Change type of ch to int 
		System.out.println("YOu entered a String : "+ch);
		
		System.out.println(" Print Character at 9 "+ch.charAt(9));
		//System.out.println("  Reverse a strring "+ch.reverse());

	}

}
