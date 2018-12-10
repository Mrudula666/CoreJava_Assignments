package corejava.assignment_1;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);//creating object for scanner class
		System.out.println("Enter the number: ");//printing the prompt message
		int number = scan.nextInt();//getting a number from key board.
		if(isArmstrong(number))//checking for armstrong number
			System.out.println(number+" is an armstrong number.");
			else
				System.out.println(number+" is not a armstrong number.");
		scan.close();

	}

	private static boolean isArmstrong(int number) {//defining the isArmstrong().
		int sum = 0, original_number = number;
			while(number !=0){
			int remainder = number%10;//getting the remainder from number
			sum +=(remainder*remainder*remainder);//obtaining and cubing of the remainders
			number = number/10;//getting the remaining number
			}
		if(original_number == sum)//checking whether the number is equal to the original number. 
			return true;
		else
		return false;
	}

}
