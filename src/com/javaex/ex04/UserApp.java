package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		
	User c1 = new Customer("jws","j1234","정우성",1000);	
	User c2 = new Customer("yjs","y2345","이효리",2000);
	User e1 = new Employee("master","m7788","운영자",5000000);
		
	User[] u1 = new User[3];
		u1[0] = c1;
		u1[1] = c2;
		u1[2] = e1;
		
		for(int i =0; i<u1.length; i++) {
			u1[i].showinfo();
		}System.out.println("운영자의 월급은 5000000원 입니다.");
		
	}

}
