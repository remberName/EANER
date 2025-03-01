package com.es.edu.javabasic.LZK.a_1_2;

/**
 * [概要] <p>変数を使った計算クラス。</p>
 * [詳細] <p>変数を使った計算プログラム（四則演算）。</p>
 * [補充] <p>特になし。</p>
 */
public class FourRulesOfArithmetic {

	/**
	 * [概要] <p>四則演算メソッド。</p>
	 * [詳細] <p>変数を使った計算。</p>
	 * [補充] <p>特になし。</p>
	 */
	public void calculation() {
		System.out.println("""
				変数は以下になる
				number1: 50
				number2: 30
				number3: 20.0
				number4: 10.0
				----------------------""");
		
		// 変数定義
		int num1 = 50;
		int num2 = 30;
		double num3 = 20.0;
		double num4 = 10.0;

		// 足し算+
		System.out.println("num1+num2=" + (num1 + num2));
		// 引き算-
		System.out.println("num1-num2=" + (num1 - num2));
		// 掛け算×
		System.out.println("num3×num4=" + (num3 * num4));
		// 割り算/
		System.out.println("num3/num4=" + (num3 / num4));
		// 割った余り％
		System.out.println("num2%num3=" + num2 % num3);
	}
}
