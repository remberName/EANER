package com.es.edu.javabasic.LZK.a_1_5;

/**
 * [概要] <p>ArithmeticException演習クラス。</p>
 * [詳細] <p>0除算時にArithmeticExceptionをキャッチするプログラム。</p>
 * [補充] <p>特になし。</p>
 */
public class NumberExceptionTest {
	
	public static void main(String[] args) {
		NumberExceptionTest t = new NumberExceptionTest();
		t.exceptionThrow();
	}

	/**
	 * [概要] <p>0除算メソッド。</p>
	 * [詳細] <p>0除算時Exceptionをキャッチする。</p>
	 * [補充] <p>特になし。</p>
	 */
	public void exceptionThrow() {
		int num1 = 100;
		int num2 = 0;

		try {
			int num3 = num1 / num2;
			System.out.println(num3);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} finally {
			System.out.println("終了");
		}
	}
}
