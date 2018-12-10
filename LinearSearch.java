package corejava.assignment_1;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number_array[] = new int[15];
		System.out.println("Enter the numbers: ");
		for(int i=0;i<number_array.length;i++){
			number_array[i] = scan.nextInt();
		}
		System.out.print("Enter the number to be searched:");
		int key = scan.nextInt();
		if(isExists(number_array,key)){
			System.out.println(key+" is found");
		}else
			System.out.println(key+" is not found.");
		scan.close();

	}

	private static boolean isExists(int[] number_array, int key) {
		boolean flag = false;
		for(int i=0;i<number_array.length;i++){
			if(key == number_array[i]){
				flag = true;
			break;
			}
			else
				flag = false;
		}
		return flag;
			
}
}