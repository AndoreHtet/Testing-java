import java.util.*;

class MiddleList{

	static Scanner sc = new Scanner(System.in);
	static int input;

	public static void main(String[] args) {
		typeInput();
		findMiddle();
	}


	static void typeInput(){
		System.out.print("Type your index of List : ");
		input = sc.nextInt();
	}
 
	static void findMiddle(){
		LinkedList<Integer> output = new LinkedList<Integer>();

		for (int i = 0; i < input ; i++ ) {
			
			System.out.print("type your value for index "+ (i + 1) + ": ");
			output.add(sc.nextInt());
		}
		System.out.print("Your input array : "+output);
		int	middleindex = output.size()/2;
		int middle1 = output.get(middleindex);
		int middle2 = output.get(middleindex - 1);
	
		if (output.size() % 2 == 0) {
			System.out.println("The middle numbers are " + middle1+ " and " + middle2);
		}else{
			System.out.println("The middle number is : " + middle1);
		}


	}


}