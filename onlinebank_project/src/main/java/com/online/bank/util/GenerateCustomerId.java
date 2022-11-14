package com.online.bank.util;

import java.util.Random;

public class GenerateCustomerId {

		public static long generateCustomerId() {
		Random random = new Random();
		long nextLong = random.nextLong();
		return nextLong;
	}

}
