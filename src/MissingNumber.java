import java.util.*;
public class MissingNumber {
	
	static Scanner sc= new Scanner(System.in);
	static int arrayIndex;
	static int[] array;
  
	public static void main(String[] args) {
		inputArrayNumber();
		inputArray();
		findingMissingElement();
	}
	
	static void inputArrayNumber() {
		System.out.print("Type your array size : ");
		arrayIndex = sc.nextInt();
	}
	
	public static void inputArray() {
		   array = new int[arrayIndex];
		System.out.print("Type your Array elements : ");
		for(int i = 0;i < arrayIndex;i++) {
			array[i] = sc.nextInt();
		}
	}
	
	static void findingMissingElement() {
		int sum = (arrayIndex+1)*(arrayIndex+2)/2;
		for(int i=0; i < arrayIndex; i++) {
			sum = sum-array[i];
		}
		System.out.println("Missing Number is : " + sum);
	}

}
