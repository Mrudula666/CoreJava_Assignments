package corejava.assignment_1;

import java.util.Scanner;

public class IncomeTax {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);//creating object for scanner class
		System.out.println("Enter the CTC of employee: ");
		int ctc = scan.nextInt();
		System.out.println("The income tax of the employee is: "+(incomeTax(ctc)));//calling the incomeTax() method and displaying the income tax
		scan.close();

	}

	private static double incomeTax(int ctc) {
		double income_tax = 0;
		if(ctc >= 0 && ctc <= 180000){//Range is between 0-1,80,000
			income_tax = (0);
		}else if(ctc >= 180001 && ctc <= 300000 ){//Range is between 1,81,001-3,00,000
			income_tax = ctc*(10*1.0/100);
		}else if(ctc >= 300001 && ctc <= 500000){//Range is between 3,00,001-5,00,000
			income_tax = (ctc*(20*1.0/100));
		}else if(ctc >= 500001 && ctc <= 1000000 )//Range is between 5,00,001-10,00,000
			income_tax = ctc*(30*1.0/100);	
		return income_tax;
		}
	
	}
