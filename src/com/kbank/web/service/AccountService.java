package com.kbank.web.service;

import java.util.Random;
import java.util.Scanner;

public class AccountService {
	public int createAccount(Scanner scanner) {
		Random r = new Random();
		String res ="";
		// 100000 ~ 999999
		int accountNum = 0;
		boolean flag = true;
		while (flag) {
			int temp = r.nextInt(1000000);
			if (temp > 100000) {
				accountNum = temp;
				flag = false;
			} 

		}
	return accountNum;
	
	}
}