package com.waiyanhtet.enums;

public class UsingEnum {
	public static void main(String[] args) {
		
		for(Days1 day : Days1.values()) {
			System.out.println(day.getViewName());
		}

		System.out.println(Days1.MON);
		System.out.println(Days1.TUES.name());
		System.out.println(Days1.TUES.ordinal());
	}
}

enum Days1 {
	
	SUN("Sunday"), MON("Monday"), TUES("Tuesday"), WED("Wednesday"), THUR("Thursday"), FRI("Friday"), SAT("Saturday");

	private String viewName;

	Days1(String viewName) {
		this.viewName = viewName;
	}

	String getViewName() {
		return this.viewName;
	}
}