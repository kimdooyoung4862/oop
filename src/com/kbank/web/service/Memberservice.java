package com.kbank.web.service;

import java.util.Scanner;

public class Memberservice {

	public String[] createMember(String num,String name1) {
		// TODO Auto-generated method stub
		String gender = ""; 
				String[] res=  new String[4]; 
		//Scanner scanner = new Scanner(System.in);
		boolean inputOk = true;
		
		switch(num.charAt(7)) {
        
        case '1': case '3' : gender = "남자";
        break;
        case '2' : case '4' : gender ="여자";
        break;
        case '5' : case '6' : gender ="외국인";
        default :
            inputOk = false;
            break;
            
        }
        if(!inputOk) {
            
        }else {
        	res[0] = name1;
        	res[1] = num;
        	res[2] = gender;
           
        }
      
		
		
        return res;
	}

}
