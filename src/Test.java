import java.util.*;

public class Test{

	static Scanner sc = new Scanner(System.in);
	static int input;
	public static void main(String[] args) {
		
		typeInput();
		reverse();
		

		
	}

	static void typeInput(){
	System.out.print("Type your lengths of LinkedList : ");	
	input = sc.nextInt();

	}

	static void reverse(){
	LinkedList<Integer> numbers = new LinkedList<Integer>();

	for (int i = 0; i < input ; i++ ) {
		System.out.print("For Index "+ (i + 1) + ": ");
		numbers.add(sc.nextInt());
	}

	for (int i = numbers.size() - 1; i >= 0 ;i-- ) {
		System.out.println(numbers.get(i));
		
	}
	}
}