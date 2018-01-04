package com.kabank.web.service;

import java.util.Random;
import java.util.Scanner;

public class AccountService {
	private String name;
	private int accountNum;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setAccountNum() {
		Random r = new Random();
		boolean flag = true;
		while (flag) {
			int temp = r.nextInt(1000000);
			if (temp > 100000) {
				accountNum = temp;
				flag = false;
			} 

		}
	
	
	}
	public int getAccontNum() {
		return this.accountNum;
		
	}
}