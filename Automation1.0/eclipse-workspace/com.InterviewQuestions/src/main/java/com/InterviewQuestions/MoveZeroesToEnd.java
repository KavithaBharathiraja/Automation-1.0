package com.InterviewQuestions;

public class MoveZeroesToEnd {

	public static void main(String[] args) {
		
		//Two pointer approach (NZ, Z)
		
		/*while(nz<len(a))
		
		if(a[nz]!=0)
		Swap(a[nz,a[z]])
		nz++
		Z++
		else
		nz++*/
		
		
		// if a is 0 or 1 we don't have to do anything
		
		int[] a = {1, 2, 0, 5, 0, 6, 3, 0, 7};

		int size = a.length;
		if(size == 0 || size == 1) {
			return;
		}
		
	int nz=0,z=0;
	
	while (nz<size) {
		if(a[nz]!= 0) {
			int temp = a[nz];
			a[nz]=a[z];
			a[z]= temp;
			nz++;
			z++;		
		}else {
			
			nz++;
		}
		
		
		System.out.println(a);
		
	}
		
		
		
		
		
		

	}

}
