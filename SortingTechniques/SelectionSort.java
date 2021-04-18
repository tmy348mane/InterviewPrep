package SortingTechniques;

public class SelectionSort {

	public static void main(String[] args) {
		int[] ar= {5,4,2,3,1};
		
		System.out.println("//****** Before Sorting ******//");
		for(int i=0;i<ar.length;i++)
			System.out.print(ar[i]+" ");
		System.out.println("\n");
		
		//Selection sort
		for(int i=0;i<ar.length-1;i++) {
			int min=i;
			int temp;
			for(int j=i+1;j<ar.length;j++) {
				if(ar[j]<ar[min])
					min=j;
			}
			temp=ar[i];
			ar[i]=ar[min];
			ar[min]=temp;
			
		}
		
	
		System.out.println("//****** After Sorting ******//");
		for(int i=0;i<ar.length;i++)
			System.out.print(ar[i]+" ");
		System.out.println("\n");

	}

}
