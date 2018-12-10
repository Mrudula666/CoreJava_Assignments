package corejava.assignment_1;

import java.util.Scanner;

public class Grading {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);//creating object for scanner class
		System.out.println("Enter the marks: ");//Getting the marks from key board
		int subject_1 = scan.nextInt();
		int subject_2 = scan.nextInt();
		int subject_3 = scan.nextInt();
		if(subject_1 >=60 && subject_2 >=60 && subject_3 >=60){
				System.out.println("PASSED");//checking whether the student is passed
		}
		else if((subject_1 >60 && subject_2 > 60) ||(subject_1 >60 && subject_3 > 60) || (subject_2 > 60 && subject_3 >60)){
			System.out.println("PROMOTED");//whether the student is promoted
		}else
			System.out.println("FAILED");//checking whether the student is failed 
			
		scan.close();

	}

}
