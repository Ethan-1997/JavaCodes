package com._520it._05_random;

import java.util.Random;

//生成一个五位的验证码
public class RandomNumDemo {
	public static void main(String[] args) {
		//下面的方法产生的验证码只能包含0～9,a～f没有大写字母以及f后的小写字母
		/*String str = UUID.randomUUID().toString();
		str = str.substring(0, 5);
		System.out.println(str);*/
		System.out.println("-------------------");
		String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		str += "abcdefghijklmnopqrstuvwxyz";
		str += "0123456789";
		StringBuilder sb = new StringBuilder(5);//创建长度为5的字符数组
		for (int i = 0; i < 5; i++) {
			char c = str.charAt(new Random().nextInt(str.length()));//随机从str中抽取一个字符
			sb.append(c);
		}
		System.out.println(sb);
	}
}
