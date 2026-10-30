package com.office.ex;

// 월급 지급 업무 처리
public class PayService {

	Daeri daeri;
	Gwajang gwajang;
	Chajang chajang;
	
	public PayService() {
		daeri = new Daeri();
		gwajang = new Gwajang();
		chajang = new Chajang();
		
		// daeri.money = 0;
		// CEO 비밀번호가 1234
		daeri.setMoney(1200000, "1234");
		
		// 누구나 월급 조회
		System.out.println("김대리 월급: " + daeri.getMoney());
	}
	
	public void pay (int month) {
		daeri.pay();
		gwajang.pay(); 
		chajang.pay(); 
		
		System.out.println(month + "월 지급 완료!!");
	}
}
