package com.es.edu.javabasic.LZK.a_3_2.java17;

import java.util.Random;

/**
 * [概要] <p>switch演習クラス。</p>
 * [説明] <p>switch演習クラス。</p>
 * [補充] <p>特になし。</p>
 */
public class SwitchExample {
	
	// ランダムクラス
	private Random random = new Random();

	/**
	 * [概要] <p>switch演習メソッド。</p>
	 * [説明] <p>switch演習メソッド。</p>
	 * [補充] <p>特になし。</p>
	 *
	 */
	public void switchExample() {

		// ランダム数字を生成
		int num = random.nextInt(9);

		// 偶数か奇数か判断
		String answer = switch (num) {
			case 1, 3, 5, 7, 9 -> "奇数";
			case 2, 4, 6, 8 -> "偶数";
			default -> "0";
		};

		// 出力
		System.out.println(answer);

		// 平日か土日か判断
		String whatDay = switch (num) {
			case 1, 2, 3, 4, 5 -> {
				String day = "workDay";
				yield day;
			}
			case 6, 7 -> {
				String day = "playDay";
				yield day;
			}
			default -> {
				String day = "this is not day";
				yield day;
			}
		};
		// 出力
		System.err.println(whatDay);
	}
}
