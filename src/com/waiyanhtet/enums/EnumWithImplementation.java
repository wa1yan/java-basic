package com.waiyanhtet.enums;

public class EnumWithImplementation {
	public static void main(String[] args) {

		for(Days2 day : Days2.values()) {
			System.out.println(day.getViewName());
			day.log();
		}

		System.out.println(Days1.MON);
		System.out.println(Days1.TUES.name());
		System.out.println(Days1.TUES.ordinal());
	}
}

interface Loggable {
	void log();
}

enum Days2 implements Loggable {

	SUN("Sunday") {
		public void log() {
			System.out.println("Last day of weekend.");
		}
	}, MON("Monday"), TUES("Tuesday"), WED("Wednesday"), THUR("Thursday"), FRI("Friday"), SAT("Saturday");

	private String viewName;

	public void log () {
		System.out.println("Hello, Today is " + viewName);
	}

	Days2(String viewName) {
		this.viewName = viewName;
	}

	String getViewName() {
		return this.viewName;
	}
}
