package _01_Lambda_Methods;

import java.util.ArrayList;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s)->{
			String back="";
			for(int i=s.length()-1; i>=0; i--) {
				back+=s.charAt(i);
			}
			System.out.println(back);
		}, "repeat");
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s)->{
			String h="";
			for(int i=0; i<s.length(); i++) {
				if(i%2==0) {
					h+=Character.toUpperCase(s.charAt(i));
				}
				else {
					h+=s.charAt(i);
				}
			}
			System.out.println(h);
		}, "repeat");
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((s)->{
			String q="";
			for(int i=0; i<s.length(); i++) {
				q+=s.charAt(i);
				q+=".";
				
			}
			System.out.println(q);
		}, "repeat");
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((s)->{
			String a="";
			for(int i=0; i<s.length(); i++) {
				if(s.charAt(i)!='a' && s.charAt(i)!='e' && s.charAt(i)!='i' && s.charAt(i)!='o' && s.charAt(i)!='u' && s.charAt(i)!='y') {
				a+=s.charAt(i);
				}
			}
			System.out.println(a);
		}, "repeat");
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
