package com.javaex.ex04;

public class Employee extends User {

	//필드
	private int salary;
	//생성자
	public Employee() {
		
	}
	public Employee(String id, String password, String name,int salary) {
		super(id,password,name);
		this.salary = salary;
	}
	
	
	//메서드 gs
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	//메서드 일반
	
	public void showinfo() {
		System.out.println("#아이디:"+id+", #패스워드:"
		+password+", 이름:"+name+", #월급:"+salary);
		System.out.println("운영자의 월급은 "+salary+"원 입니다.");
	}

	
}
