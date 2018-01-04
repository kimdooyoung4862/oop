package com.kabank.web.controller;

import java.util.Scanner;

import com.kabank.web.service.AccountService;
import com.kabank.web.service.MemberService;

public class Portal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("[MENU] 0 종료 1 회원가입 2 계좌개설");

			switch (scanner.nextInt ()) {
			case 0:System.out.println("종료");return;
			case 1:
				MemberService memberService = new MemberService();
				
				System.out.println("이름");
				memberService.setName(scanner.next());
				System.out.println("주민번호");
				memberService.setSsn(scanner.next());
				memberService.setAge();
				memberService.setCustomNum();
				memberService.setGender();
				
				
				System.out.println(""
						+ "[고객번호] "+memberService.getCustomNum()
						+ "[주민번호] "+memberService.getSsn()
						+ "[이름] "+memberService.getName() 
						+ "[성별] "+memberService.getGender()
						+ "[나이] "+memberService.getAge());
			break;
			case 2:
				AccountService accountService = new AccountService();
				System.out.println("이름");
				accountService.setName(scanner.next());
				System.out.println(""
						+ "[이름] "+accountService.getName()
						+ "[계좌번호] "+accountService.getAccontNum());
			break;
			}
		}
	}
}
