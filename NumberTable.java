package corejava.assignment_1;

import java.util.Scanner;

public class NumberTable {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);//creating object for scanner class
		System.out.println("Enter the number: ");
		int number = scan.nextInt();
		numberTable(number);//calling the numberTable() method
		scan.close();

	}

	private static void numberTable(int number) {//defining the numberTable() method.
		for(int i=1;i<=10;i++){
			int multiply = number*i;
			System.out.println(number+" * "+i+" = "+(multiply)+" --------->"+(multiply*multiply));
		}
		
	}

}
