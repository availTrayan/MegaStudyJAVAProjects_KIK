package test.test02;

import java.util.Scanner;

public class Student {
	
	private String name;
	private String school;
	private String phone;
	private String subject;
	
	public Student(String name, String school, String phone, String subject) {
		
		this.name = name;
		this.school = school;
		this.phone = phone;
		this.subject = subject;
		
	}
	
	
	public void printInfo() {
		System.out.println(subject + " 수업" + " : " + school + " " + name + "학생");
	}
	
	public void setSchool(String school) {
		this.school = school;
		System.out.println(name + "님의 학교가 " + school + "(으)로 변경되었습니다.");
	}
	
	public void sendScheduleMessage() {
		System.out.println(name + "학생에게 " + "(" + phone + ")" + " 수업일정 메시지를 전송합니다.");
	}
	
	public void sendMessage(String message) {
		System.out.println(name + "학생에게 " + "(" + phone + ")" + message + " 라고 전송합니다.");
	}
	
	
	

}
