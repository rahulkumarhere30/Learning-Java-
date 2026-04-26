import java.util.Arrays;
import java.util.Scanner;

public class testingAI {
    
    // Function to remove duplicates from array
    public static int[] removeDuplicates(int[] arr) {
        if (arr.length == 0) {
            return arr;
        }
        
        // Sort the array first
        Arrays.sort(arr);
        
        // Count unique elements
        int uniqueCount = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                uniqueCount++;
            }
        }
        
        // Create new array with unique elements
        int[] result = new int[uniqueCount];
        result[0] = arr[0];
        int index = 1;
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                result[index] = arr[i];
                index++;
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] array = new int[10];
        
        // Request user input
        System.out.println("Enter 10 numbers for the array:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        
        // Display original array
        System.out.println("\nOriginal array: " + Arrays.toString(array));
        
        // Remove duplicates
        int[] uniqueArray = removeDuplicates(array);
        
        // Display array without duplicates
        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArray));
        System.out.println("Number of unique elements: " + uniqueArray.length);
        
        scanner.close();
    }
}
