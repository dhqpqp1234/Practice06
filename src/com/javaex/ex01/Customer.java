package com.javaex.ex01;

public class Customer extends Person{
	//필드
	private int cNo;
	private int Point;
	//생성자
	public Customer () {
		
	}
	
	public Customer(String name, String hp,int cNo, int point) {
		super(name,hp);
		this.cNo = cNo;
		Point = point;
	}

	
	
	//메서드 gs
	public int getcNo() {
		return cNo;
	}

	public void setcNo(int cNo) {
		this.cNo = cNo;
	}

	public int getPoint() {
		return Point;
	}

	public void setPoint(int point) {
		Point = point;
	}
	//메서드 일반

	@Override
	public String toString() {
		return "Customer [cNo=" + cNo + ", Point=" + Point + "]";
	}
	
	public void showinfo() {
		System.out.println("이름: "+name+", 전화번호: "+hp+", #고객번호:"+cNo+", #포인트점수:"+Point);
	}
	
	
}
