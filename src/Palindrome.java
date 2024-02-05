import java.util.*;
import java.util.Collection;


public class Palindrome {
	
	
	static Scanner sc = new Scanner(System.in);
	static String reverse ="";
	static String input;
	static String ask = null;
	
	
	public static void main(String []args) {
		do {
			typeInput();
			doReverse();
			checkPalindrome();
			askNexttime();
		} while (ask.equalsIgnoreCase("y"));
		System.out.println("_____Thank You_____");
	}
	
	static void typeInput() {
		System.out.print("Type your word or number : ");
		input = sc.nextLine();
	
	}
	
	static void askNexttime() {
		System.out.println("Do you want to another try? (Y/N)");
		ask = sc.nextLine();
		
	
	}
	
	static void doReverse() {
		
		int length = input.length();
		for(int i = length - 1; i >= 0;i--) {
			reverse = reverse + input.charAt(i);
		}
	}
	
	static void checkPalindrome() {
		String inputLowerCase = input.toLowerCase().replaceAll("\\s", "");
		String reverseLowerCase = reverse.toLowerCase().replaceAll("\\s", "");
		if(inputLowerCase.equals(reverseLowerCase)) {
			System.out.println("This is Palindrome.");
		}else {
			System.out.println("This is not Palindrome.");
		}
	}

}
