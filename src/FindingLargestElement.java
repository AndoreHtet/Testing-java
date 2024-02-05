import java.util.*;


public class FindingLargestElement {
	
	static Scanner sc = new Scanner(System.in);
	static int input;
	static int[] elements;
	
	public static void main(String[] args) {
		inputArray();
		checkLargestElement();
	}
	
	static void inputArray() {
		System.out.print("Type your array index number : ");
		input = sc.nextInt();
		elements = new int[input];
		System.out.print("Type your array elements");
		for(int i=0; i<input;i++) {
			elements[i]= sc.nextInt();
		}
		System.out.println(Arrays.toString(elements));
		
	}
	
	static void checkLargestElement() {
		
	int	result = Arrays.stream(elements).max().orElse(0);
	System.out.println("The largest Element : " + result);
	}

}
