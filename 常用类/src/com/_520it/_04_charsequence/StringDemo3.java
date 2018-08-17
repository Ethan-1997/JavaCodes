package com._520it._04_charsequence;

//比较String、StringBUffer和StringBuilder在字符串拼接时的耗时情况
public class StringDemo3 {
	
	public static void main(String[] args) {
		test1();
		test2();
		test3();
	}

	private static void test3() {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("");
		long begin = System.currentTimeMillis();
		for (int i = 0; i < 30000; i++) {
			sb.append(i);
		}
		long end = System.currentTimeMillis();
		System.out.println(end - begin);
	}

	private static void test2() {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("");
		long begin = System.currentTimeMillis();
		for (int i = 0; i < 30000; i++) {
			sb.append(i);
		}
		long end = System.currentTimeMillis();
		System.out.println(end - begin);
	}

	private static void test1() {
		// TODO Auto-generated method stub
		String str = "";
		long begin = System.currentTimeMillis();
		for (int i = 0; i < 30000; i++) {
			str += i;
		}
		long end = System.currentTimeMillis();
		System.out.println(end - begin);
	}

}
