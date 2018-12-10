package corejava.assignment_1;

import java.util.Scanner;

public class UniqueArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number_array[] = new int[5];
		System.out.println("Enter the numbers: ");
		for(int i=0;i<number_array.length;i++){
			number_array[i] = scan.nextInt();
		}
		System.out.println(uniqueArray(number_array));
		scan.close();

	}

	private static String uniqueArray(int[] number_array) {
		String unique_elements =new String();
		for(int i=0;i<number_array.length;i++){
			for(int j=i;j<number_array.length;j++){
				if(number_array[i] == number_array[j])
					break;
				else
					unique_elements +=number_array[i]+" ";
			}
		}
		
		return unique_elements.trim();
		
	}

}
