import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] expandedArray = expandArray(array, 10);
        int[] newArray = insertElement(expandedArray, 99, 2);

        System.out.println("Expanded Array: " + Arrays.toString(expandedArray));
        System.out.println("Array after Insertion: " + Arrays.toString(newArray));

    }

	 public static int[] expandArray(int[] oldArray, int newSize) {
	        int[] newArray = new int[newSize];
	        for (int i = 0; i < oldArray.length; i++) {
	            newArray[i] = oldArray[i];
	        }
	        return newArray;
	    }
	 public static int[] insertElement(int[] array, int element, int index) {
	        int[] newArray = new int[array.length + 1];

	        // Copy elements before the insertion point
	        for (int i = 0; i < index; i++) {
	            newArray[i] = array[i];
	        }

	        // Insert the new element
	        newArray[index] = element;

	        // Copy elements after the insertion point
	        for (int i = index + 1; i < newArray.length; i++) {
	            newArray[i] = array[i - 1];
	        }

	        return newArray;
	    }

}
