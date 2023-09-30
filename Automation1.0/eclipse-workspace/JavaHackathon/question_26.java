package Assignment_1;
import java.util.*;
public class question_26 {

	public static void main(String[] args) {
		/*WJP to merge two sorted array.
		 *(Do not use third array)		
		 *array1[10] = 1,2,4,6,9,10	
		 *array2[4] =  3, 5,7,8, 
		 *After merge :array1[10] = 1,2,3,4,5,6,7,8,9,10
		 */
     
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements:");
        int n = scanner.nextInt();
        
        scanner.close();

        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        quickSort(arr, 0, n - 1);
        System.out.println("Sorted array in ascending order:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
	}
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(arr, low, high);
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;					
	}
}
