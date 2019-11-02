/**
 * @program: usermanagerment
 * @Description: Login by selecting
 * @author: JT
 * @date: 2019-10-30 
 */
package com.jt.usermangement;

import java.util.Scanner;

/**
 * @author JT
 * @date   2019-10-30
 */
public class Management {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 10;
		

		System.out.println("Please make the choose below:1 login, 2 register, 3 forget password, 4 exit");
		Scanner scanner = new Scanner(System.in);
		int choose = scanner.nextInt();
		switch (choose) {
		case 1:
			UserServiceImplement userServiceImplement = new UserServiceImplement();
			User user = new User();

			System.out.println("Plesae input username:");
			user.setUsername(scanner.next());

			System.out.println("Please input password:");
			user.setUserpassword(scanner.next());
			result = userServiceImplement.login(user);
			break;
			
		default:
			System.out.println(result);
			break;
		}
		

	}

}
