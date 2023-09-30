package Assignment_1;



public class question_62 {

	public static void main (String[] args) {
		/*
		 * write an algorithm to reverse first 3 numbers, 
		 * then next 3 numbers, then next 3 numbers, 
		 * the number will be  based on VAR k. 
		 * Array = [3,2,4,7,0,3,1,5,8, 4],  k=3      
		 *  OutPut = [4,2,3,3,0,7,8,5,1,4]
		 */
     
	int[]array = {3,2,4,7,0,3,1,5,8,4};
	
	int k =3;	
	int[]reversedArray =reverseGroups(array, k);
	System.out.println("output: ");
	System.out.println();
	for(int num : reversedArray) {
		System.out.print(num+ " ");
	}	
	}
	private static int[] reverseGroups(int[] array, int k) {
		
	int length = array.length;
	int[]result = new int[length];
	
	for(int i = 0; i<length; i+=k) {
		
		int start =i;
		int end=Math.min(i+k-1,  length -1);
		
		while(start<end) {
			
			int temp = array[start];
			array[start]= array[end];
			array[end]= temp;
			start++;
			end--;
		}
		
	for(int j = i; j<= end ; j++) {
		result[j] = array[j];
	}
	
	}		
		return result;
	}

	}

	
	


	


