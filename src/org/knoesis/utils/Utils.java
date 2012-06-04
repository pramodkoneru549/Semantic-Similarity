package org.knoesis.utils;

import java.sql.Time;

public class Utils {
	
	public static void sleep(int secs) throws InterruptedException{
		Thread.sleep(secs*1000);
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Start");
		Utils.sleep(10);
		System.out.println("Stop");
	}
}
