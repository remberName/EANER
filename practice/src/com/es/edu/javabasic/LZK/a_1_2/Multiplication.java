package com.es.edu.javabasic.LZK.a_1_2;

/**
 * [概要] <p>繰り返し処理クラス。</p>
 * [詳細] <p>繰り返し処理を用いた九九の表示 </p>
 * [補充] <p>特になし。</p>
 */
public class Multiplication {

	/**
	 * [概要] <p>九九出力メソッド。</p>
	 * [詳細] <p>一から九までの掛け算。</p>
	 * [補充] <p>特になし。</p>
	 */
	public void multiplicationTable() {
		
		// 前の1-9まで数字をループする
		for (int i = 1; i <= 9; i++) {
			// 後ろの1-iまで数字ループする
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "×" + i + "=" + i * j + "\t");
			}
			// 改行する
			System.out.println();
		}
	}
}
