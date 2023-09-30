package Assignment_1;
import java.util.Scanner;
public class arraysort {
  static Scanner scanner = new Scanner(System.in);
  
  
	public static void main(String[] args) {
		
		System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        scanner.close();

        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[j+1]) {
                      
            // Swap arr[i] with the smallest element
             int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
        
                }
            }
        }
        System.out.println("Enter the elements of the  sorted array:");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]+ " ");
      
        }

	}

	}
