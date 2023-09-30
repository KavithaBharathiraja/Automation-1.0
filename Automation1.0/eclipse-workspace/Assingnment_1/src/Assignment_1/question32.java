package Assignment_1;



public class question32 {
	
	//You are given two sorted arrays, A and B, and A has a large enough buffer at the end to hold B. Write a method to merge B into A in sorted order.



	public static void mergeArrays(int[] A, int m, int[] B, int n) {
	    int i = m - 1; // Index of last element in A
	    int j = n - 1; // Index of last element in B
	    int k = m + n - 1; // Index of last element in merged array A

	    // Merge elements from the end of A and B into A in sorted order
	    while (i >= 0 && j >= 0) {
	        if (A[i] > B[j]) {
	            A[k] = A[i];
	            i--;
	        } else {
	            A[k] = B[j];
	            j--;
	        }
	        k--;
	    }

	    // Copy remaining elements from B to A if any
	    while (j >= 0) {
	        A[k] = B[j];
	        j--;
	        k--;
	    }

	}

	
}
		
		
	


