package corejava.assignment_1;

import java.util.Scanner;

public class Date {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);//creating scanner object
		System.out.println("Enter the date: ");
		String date = scan.next();//getting the date
		String month_number = date.substring(3,5);
		//System.out.println(month_number);
		switch(month_number){//converting the month_number to string
		case "01":
			month_number = "January";
			break;
		case "02":
			month_number = "Febrauary";
			break;
		case "03":
			month_number = "March";
			break;
		case "04":
			month_number = "April";
			break;
		case "05":
			month_number = "May";
			break;
		case "06":
			month_number = "June";
			break;
		case "07":
			month_number = "July";
			break;
		case "08":
			month_number = "August";
			break;
		case "09":
			month_number = "September";
			break;
		case "10":
			month_number = "October";
			break;
		case "11":
			month_number = "November";
			break;
		case "12":
			month_number = "December";
			break;		
		}
		String date_parts[] = date.split(",");
		String new_date = date_parts[0]+"/"+month_number+"/"+date_parts[date_parts.length-1];//adding "/" string
		System.out.println(new_date);
		scan.close();		
		
	}

}
