package com.kabank.web.service;


public class MemberService {
	private int customNum;
	private String name;
	private int age;
	private String gender;
	private String ssn;
	public MemberService() {
		this.customNum = 0;
		this.name = "";
		this.age = 0;
		this.gender = "";
		this.ssn = "";
	}
	public void setCustomNum() {
		this.customNum = 101;
	}
	public int getCustomNum() {
		return this.customNum;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setAge() {
		int year = 2017;
		int j = 0;
		int a = Integer.parseInt(ssn.charAt(0)+""+ssn.charAt(1));
		j = year -1899 - a;
		this.age = j;
		
		
	}
	public int getAge() {
		return this.age;
	}
	public void setGender() {
		String a = "";
		
		boolean inputok = true;
		char ch = ssn.charAt(7);
		
		if (ch == '1' || ch == '3') {
			a = "남자";
		}else if(ch == '2' || ch == '4') {
			a = "여자";
		}else if(ch == '5' || ch == '6') {
			a = "외국인";
		}else {
			inputok = false;
		}
		
		if (!inputok) {
			a = "다시입력";
		}else {
			
		}
		this.gender = a;
	}
	public String getGender() {
		return this.gender;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getSsn() {
		return this.ssn;
	}
}


