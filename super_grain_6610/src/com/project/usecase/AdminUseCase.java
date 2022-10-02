package com.project.usecase;


import java.util.Scanner;

import com.project.dao.AdminDaoImp;
import com.project.exceptions.AdminException;
import com.project.main.UserActivity;

public class AdminUseCase {

	public static void adminLogin() {		

		Scanner sc = new Scanner(System.in);

		System.out.println("\nEnter admin details -");
		System.out.println("Enter Username: ");
		String username = sc.next();

		System.out.println("Enter Password: ");
		String password = sc.next();	
		
		
		try {
			new AdminDaoImp().loginAdmin(username, password);			
			
			System.out.println("\nWelcome! Login Successful...");
			UserActivity.adminOptions();
			

		} catch (AdminException e) {
			System.out.println(e.getMessage());			
			
			System.out.println("\nTry again...");
			UserActivity.selectUser();
		}

	}

}

