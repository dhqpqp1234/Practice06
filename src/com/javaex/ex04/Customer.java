package com.javaex.ex04;

public class Customer extends User{

	//필드
	private int point;
	//생성자
	public Customer() {
		
	}
	public Customer(String id, String password, String name, int point) {
		super(id,password,name);
		this.point = point;
	}
	//메서드 gs
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	//메서드 일반
	
	public void showinfo() {
		System.out.println("#아이디:"+id+", #패스워드:"
		+password+", 이름:"+name+", #포인트:"+point);
		
	}
}
