package SortingTechniques;

public class InsertionSort {

	public static void main(String[] args) {
		int[] ar = { 5, 4, 2, 3, 1 };

		System.out.println("//****** Before Sorting ******//");
		for (int i = 0; i < ar.length; i++)
			System.out.print(ar[i] + " ");
		System.out.println("\n");
		
		int j,key;
		//Insertion Sort
		for(int i=1;i<ar.length;i++) {
			key=ar[i];
			 j=i-1;
			
			while(j>=0 && ar[j]>key) {
				ar[j+1]=ar[j];
				j--;
				
			}
			ar[j+1]=key;
		}
		
		System.out.println("//****** After Sorting ******//");
		for (int i = 0; i < ar.length; i++)
			System.out.print(ar[i] + " ");
		System.out.println("\n");

	}

}
