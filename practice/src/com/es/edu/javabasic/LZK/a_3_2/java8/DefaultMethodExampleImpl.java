package com.es.edu.javabasic.LZK.a_3_2.java8;

/**
 * [概要] <p>デフォルトメソッド演習インターフェース。</p>
 * [説明] <p>デフォルトメソッド演習インターフェース。</p>
 * [補充] <p>特になし。</p>
 */
public interface DefaultMethodExampleImpl {

	// 一般的な抽象メソッド
	void abstractMethod();
	
	/**
	 * [概要] <p>デフォルトメソッド。</p>
	 * [説明] <p>デフォルトメソッド。</p>
	 * [補充] <p>特になし。</p>
	 *
	 */
	default void defaultMethod() {
		System.out.println("this is a default method");
	}
	
	/**
	 * [概要] <p>デフォルトメソッドをオーバーライドメソッド。</p>
	 * [説明] <p>デフォルトメソッドをオーバーライドする。</p>
	 * [補充] <p>特になし。</p>
	 *
	 */
	default void overrideDefaultMethod() {
		System.out.println("this is a override default method");
	}
	
}
