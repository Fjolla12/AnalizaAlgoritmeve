package Projekti2;

public class modifiedBubble {
	static int modifiedBubbleSort(int arr[])
	{
		int numberOfIterations=0;
		int n = arr.length;
		boolean sorted=false;
		for (int i = 0; i < n - 1 &&!sorted; i++) {
			sorted=true;
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					sorted=false;
				    }
				}
			numberOfIterations++;
			}
		return numberOfIterations;
		}

	public static void main(String args[]){
		int arr[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25,26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
		final long startTime = System.currentTimeMillis();
		int numberOfIterations=modifiedBubbleSort(arr);
		final long endTime = System.currentTimeMillis();
		int n = arr.length;
		
		System.out.println("Sorted array:");
		for (int i = 0; i < n; ++i) {
			System.out.print(arr[i] + " ");	
			}
		System.out.println();

		if(numberOfIterations==1) {
			System.out.println("Array with length " + n + " was sorted in " +numberOfIterations+ " iteration");
		}
		else {
		System.out.println("Array with length " + n + " was sorted in " +numberOfIterations+ " iterations");
		}
		
	    System.out.println("Total execution time: " + (endTime - startTime)+" miliseconds");
		}
	
}

