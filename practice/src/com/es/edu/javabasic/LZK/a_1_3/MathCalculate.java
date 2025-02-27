package com.es.edu.javabasic.LZK.a_1_3;
/**
 * [概要] <p>計算クラス。</p>
 * [詳細] <p>計算を行うメソッド（加減乗除）。</p>
 * [補充] <p>特になし。</p>
 */
public class MathCalculate {

	/**
	 * [概要] <p>四則演算メソッド。</p>
	 * [詳細] <p>変数を使った計算。</p>
	 * [補充] <p>特になし。</p>
	 * 
	 * @param num1 引数
	 * @param num2 引数
	 * @param num3 引数
	 * @param num4 引数
	 */
	public void calculation(int num1,int num2,double num3,double num4) {
		
		// 足し算+
		System.out.println(num1+"+"+num2+"=" + (num1 + num2));
		// 引き算-
		System.out.println(num1+"-"+num2+"=" + (num1 - num2));
		// 掛け算×
		System.out.println(num1+"×"+num2+"=" + (num3 * num4));
		// 割り算/
		System.out.println(num1+"/"+num2+"=" + (num3 / num4));
		// 割った余り％
		System.out.println(num1+"%"+num2+"=" + num2 % num3);
	}
}
