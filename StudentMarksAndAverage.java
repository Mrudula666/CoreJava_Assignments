package corejava.assignment_1;

import java.util.Scanner;

public class StudentMarksAndAverage {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);//creating scanner object
		System.out.println("Enter the marks of the 3 student: ");
		int total_marks[] = new int[3];
		int j=0;
		double average[] = new double[3];
		//obtaining the marks and printing the total and average of individual students
		for(int i=1;i<=3;i++){
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int total_marks_of_one_student = (A+B+C);
		System.out.println("Total marks of student"+" "+i+": "+total_marks_of_one_student);
		total_marks[j] = total_marks_of_one_student;
		double average_of_one_student = (double)(A+B+C/3);
		System.out.println("Average of one student"+" "+i+": "+average_of_one_student);
		average[j] = average_of_one_student;
		j++;
		}
		int total = 0;
		for(j=0;j<3;j++){
			total += total_marks[j];
		}
		//getting the total average of the class.
		double total_average = (double)total/3;
		System.out.println("Total marks of class: "+total);
		System.out.println(("Average: "+total_average));
		scan.close();

	}

}
