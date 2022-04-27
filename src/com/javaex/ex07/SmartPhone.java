package com.javaex.ex07;

public class SmartPhone extends MusicPhone {
    
    public void execute (String str){
        
        if("앱".equals(str)) {
        	playApp();
        }else {
        	super.execute(str);
        }
        
    }
 
    //메소드작성
    
    //메소드작성
    protected void playApp(){
        System.out.println("앱실행");
    }
    
    
}
