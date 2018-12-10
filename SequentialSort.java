package corejava.assignment_1;

import java.util.Scanner;

public class SequentialSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);//creating scanner object
		int number_array[] = new int[5];
		System.out.print("Enter the numbers: ");
		for(int i=0;i<number_array.length;i++){
			number_array[i] = scan.nextInt();
		}
		int sorted_array[] =sequentialSort(number_array);
		System.out.println("After Sorting: ");
		for(int i=0;i<sorted_array.length;i++){
			System.out.print(sorted_array[i]+" ");//obtaining the sorted array. 
		}
		scan.close();

	}

	private static int[] sequentialSort(int[] number_array) {//declaring the sequentialSort() method.
		for(int i=0;i<number_array.length;i++){
			for(int j=i+1;j<number_array.length;j++){//sorting the array.
				if(number_array[i]<=number_array[j]){
					int temp = number_array[i];
					number_array[i] = number_array[j];
					number_array[j] =temp;
				}
			}
		}
		
		return number_array;//returning the sorted_array.
	}

}
