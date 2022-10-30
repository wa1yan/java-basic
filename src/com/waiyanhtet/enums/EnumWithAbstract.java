package com.waiyanhtet.enums;

public class EnumWithAbstract {
	public static void main(String[] args) {

		for(Days3 day : Days3.values()) {
			day.log();
		}

	}
}

enum Days3 {

	SUN("Sunday") {
		public void log() {
			System.out.println("Hello " + this.viewName);
		}
	}, MON("Monday") {
		public void log() {
			System.out.println("Hello " + this.viewName);
		}
	}, TUES("Tuesday") {
		public void log() {
			System.out.println("Hello " + this.viewName);
		}
	}, WED("Wednesday") {
		public void log() {
			System.out.println("Hello " + this.viewName);
		}
	}, THUR("Thursday") {
		public void log() {
			System.out.println("Hello " + this.viewName);
		}
	}, FRI("Friday") {
		public void log() {
			System.out.println("Hello " + this.viewName);
		}
	}, SAT("Saturday") {
		public void log() {
			System.out.println("Hello " + this.viewName);
		}
	};

	protected String viewName;

	public abstract void log();

	Days3(String viewName) {
		this.viewName = viewName;
	}

	String getViewName() {
		return this.viewName;
	}
}
