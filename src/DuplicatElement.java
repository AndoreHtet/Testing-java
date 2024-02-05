import java.util.*;


public class DuplicatElement {
	
	static Scanner sc = new Scanner(System.in);
	static int input;
	static int[] elements;
	
	public static void main(String[] args) {
		inputArray();
		findingDuplicate();
		
	}
	
	static void inputArray() {
		System.out.print("Type your array length : ");
		input = sc.nextInt();
		elements = new int[input];
		
		System.out.print("Type your elements : ");
		for(int i = 0; i<input;i++) {
			elements[i] = sc.nextInt();
		}
	}
	
	static void findingDuplicate() {
		for(int i=0;i<elements.length;i++) {
			for (int j = i + 1; j < elements.length ; j++) {
				if (elements[i] == elements[j]) {
					System.out.println("Duplicate number is : " + elements[j]);
				}
			}
		}
	}

}
