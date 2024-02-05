import java.util.*;

public class TwoMergeArray {
	
	static Scanner sc = new Scanner(System.in);
	static int array1;
	static int array2;
	
	public static void main(String[] args) {
	   ArrayList<Integer> firstArray =inputForArray();
	   ArrayList<Integer> secondArray =inputForArray();
	   ArrayList<Integer> mergedArray = merge(firstArray, secondArray);
	  displayArrayWithoutTrailingZeros(mergedArray);
	}
	
	 public static ArrayList<Integer> inputForArray() {
	        System.out.print("Type your array's index number: ");
	        int arraySize = sc.nextInt();

	        ArrayList<Integer> array = new ArrayList<>();

	        for (int i = 0; i < arraySize; i++) {
	            System.out.print("Type your number for index " + (i + 1) + ": ");
	            array.add(sc.nextInt());
	        }

	        System.out.println("Array: " + array);
	        return array;
	    }

	
	static ArrayList<Integer> merge(ArrayList<Integer> firstArray,ArrayList<Integer> secondArray) {
		
	
		
		int firstArrayPosition = 0;
		int secondArrayPosition = 0;
	
		
		ArrayList<Integer> mergedArray = new ArrayList<>();
		
		
		while(secondArrayPosition < secondArray.size() && firstArrayPosition < firstArray.size()) {
			int firstElement = firstArray.get(firstArrayPosition);
			int secondElement = secondArray.get(secondArrayPosition);
			if(firstElement < secondElement)
					{
				if (!mergedArray.isEmpty() && firstElement != mergedArray.get(mergedArray.size() - 1) && firstElement > 0) {
	                mergedArray.add(firstElement);
	            } else if (mergedArray.isEmpty() && firstElement > 0) {
	                mergedArray.add(firstElement);
	            }
				firstArrayPosition++;
			}else {
				if (!mergedArray.isEmpty() && secondElement != mergedArray.get(mergedArray.size() - 1)) {
	                mergedArray.add(secondElement);
	            } else if (mergedArray.isEmpty()) {
	                mergedArray.add(secondElement);
	            }
				secondArrayPosition++;
			}
		}
		while(firstArrayPosition < firstArray.size()) {
			int firstElement = firstArray.get(firstArrayPosition);
	        if (!mergedArray.isEmpty() && firstElement != mergedArray.get(mergedArray.size() - 1) && firstElement > 0) {
	            mergedArray.add(firstElement);
	        } else if (mergedArray.isEmpty() && firstElement > 0) {
	            mergedArray.add(firstElement);
	        }
	        firstArrayPosition++;

		}
		while(secondArrayPosition < secondArray.size()) {
			int secondElement = secondArray.get(secondArrayPosition);
	        if (!mergedArray.isEmpty() && secondElement != mergedArray.get(mergedArray.size() - 1)) {
	            mergedArray.add(secondElement);
	        } else if (mergedArray.isEmpty()) {
	            mergedArray.add(secondElement);
	        }
	        secondArrayPosition++;
		}
		

		return mergedArray;
	}
	 static void displayArrayWithoutTrailingZeros(ArrayList<Integer> arr) {
	        System.out.print("Output: [");
	        boolean firstElement = true;
	        for (int num : arr) {
	            if (num != 0) {
	                if (!firstElement) {
	                    System.out.print(", ");
	                }
	                System.out.print(num);
	                firstElement = false;
	            }
	        }
	        System.out.println("]");
	    }
	
}
