package com.elfunction;

import java.util.Date;

//greet()
public class GreetFunction {

	public static String greet() {

		Date d = new Date();

		int h = d.getHours();// Calendar

		if (h >= 6 && h <= 11) {
			return "Good Morning";
		} else if (h >= 12 && h <= 17) {
			return "Good Noon";
		} else {
			return "Good Evening";
		}

	}
}
