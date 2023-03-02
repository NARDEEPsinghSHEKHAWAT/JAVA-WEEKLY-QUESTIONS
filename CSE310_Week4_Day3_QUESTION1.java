import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // get size of array from user
        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();
        
        // check if size is negative
        if(size < 0) {
            System.out.println("Invalid Array Size");
            return;
        }
        
        int[] array = new int[size];
        
        // get array elements from user
        System.out.print("Enter array elements: ");
        for(int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
            
            // check if element is negative
            if(array[i] < 0) {
                System.out.println("Invalid Array Elements");
                return;
            }
        }
        
        // find second largest element in array
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for(int i = 0; i < size; i++) {
            if(array[i] > largest) {
                secondLargest = largest;
                largest = array[i];
            } else if(array[i] > secondLargest && array[i] != largest) {
                secondLargest = array[i];
            }
        }
        
        System.out.println("Second largest element: " + secondLargest);
        
        scanner.close();
    }
}
