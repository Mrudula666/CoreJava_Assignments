package corejava.assignment_1;

import java.util.Scanner;

public class UserValidation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String user_name = "Mrudula";
		String password = "test!2134";
		System.out.println("Enter the user name: ");
		String u_name = scan.next();
		System.out.println("Enter the password: ");
		String pwd = scan.next();
		if(user_name.equals(u_name) && password.equals(pwd)){
			System.out.println("Welcome "+user_name);
		}else{
			int i=1;
			while(i<3){
				if(user_name.equals(u_name) && password.equals(pwd)){
					System.out.println("Welcome "+user_name);
					break;
				}else{
					System.out.println("Invalid credentials :( Enter again.");
					System.out.println("Enter the user name: ");
					u_name = scan.next();
					System.out.println("Enter the password: ");
					pwd = scan.next();
					i++;
				}
			}
			if(user_name.equals(u_name) && password.equals(pwd)){
				System.out.println("Welcome "+user_name);
			}else{
				System.out.println("Contact admin");
			}
		}
		scan.close();
	}

}
