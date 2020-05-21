
public class SelectionSort {

	public static void swap(int[] list, int i, int j) {
	
	int temp = list[i];
	list[i] = list[j];
	list[j] = temp;
}

public static void selectionSort(int[] a) {
	for (int i = 0; i < a.length; i++) {
		int largest = i;
		for (int j = i + 1; j < a.length; j++) {
			if (a[j] < a[largest]) {
				largest = j;
			}
		}
		swap(a,i, largest);
		
		}
	}

public static void main(String args[])
{

	
	int  arr[] = {64, 25, 12, 22, 11}; 

	System.out.println("Unsorted array");

	for (int i=0; i<arr.length; ++i) {
		System.out.print(arr[i] + " ");
	}

	System.out.println();

	selectionSort(arr);
	System.out.println("Sorted array");
	

	for (int i=0; i<arr.length; ++i) {
		System.out.print(arr[i] + " ");
	}

	System.out.println();
}

}