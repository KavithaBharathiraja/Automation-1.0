package JULY2023Code;

public class RotateAnArray {
	
	
	static void rotateOne(int[]a) {
		
		int temp =a[0];
		for(int i=1; i<a.length; i++) {
			a[i-1]=a[i];
			
		}
		a[a.length-1]=temp;		
	}
	
	static void rotate(int[] a ,int k) {
		
		k =k%a.length;
		if(k<0) {
			k=k+a.length;
		}
			for(int i=1; i<=k; i++) {
				rotateOne(a);
			}
		}
	

	public static void main(String[] args) {
	
		int [] a = { 1,3,2,5,4};
		for(int i= 0; i<a.length; i++) {
			System.out.println(a[i]+" ");
		}
		System.out.println();
		
		rotate(a, 3);
		for(int i= 0; i<a.length; i++) {
			System.out.println(a[i]+" ");
	}
	}

}
