package SortingTechniques;

public class BubbleSort {

	public static void main(String[] args) {
		int[] ar = { 5, 4, 2, 3, 1 };

		System.out.println("//****** Before Sorting ******//");
		for (int i = 0; i < ar.length; i++)
			System.out.print(ar[i] + " ");
		System.out.println("\n");
		
//	//Bubble sort
		for(int i=0;i<ar.length;i++){
			for(int j=i+1;j<ar.length;j++) {
				if(ar[j]<ar[i]) {
					int temp=ar[j];
					ar[j]=ar[i];
					ar[i]=temp;
				}
			}
		}		
		System.out.println("//****** After Sorting ******//");
		for (int i = 0; i < ar.length; i++)
			System.out.print(ar[i] + " ");
		System.out.println("\n");

	}

}
