package com.kabank.web.contriller;

import java.util.Scanner;

import com.kbank.web.service.AccountService;
import com.kbank.web.service.Memberservice;

public class Portal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		AccountService accountService = new AccountService();
		Memberservice memberservice = new Memberservice();
		while (true) {
			System.out.println("[MENU] 0.종료 1.회원 가입2.계좌 개설");

			switch (scanner.nextInt ()) {
			case 0:System.out.println("종료");return;
			case 1:
				System.out.println("이름");
				String name1 = scanner.next();
				System.out.println("주민");
				String num = scanner.next();
				String[] res = memberservice.createMember(num, name1);
				System.out.printf( 
					"[이름] %s" + " [주민] %s" + "[성별]%s\n" , res[0], res[1], res[2]);
			return;
			
			case 2: 
				System.out.println("이름이 무엇이냐.");
				String name = scanner.next();
				//int res = accountService.createAccount(scanner);
				System.out.println("[이름]" + name + "[계좌번호]"+accountService.createAccount(scanner));
			break;
			}
		}
	}
}
