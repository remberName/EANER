package com.es.edu.javabasic.LZK.a_3_2.java8;

/**
 * [概要] <p>デフォルトメソッド演習クラス。</p>
 * [説明] <p>デフォルトメソッド演習クラス。</p>
 * [補充] <p>特になし。</p>
 */
public class DefaultMethodExample implements DefaultMethodExampleImpl{

	/**
	 * デフォルトメソッド演習インターフェースの抽象メソッド実装
	 */
	@Override
	public void abstractMethod() {
		System.out.println("implement abstract method ");
	}

	/**
	 * デフォルトメソッドをオーバーライドする
	 */
	@Override
	public void defaultMethod() {
		System.out.println("this is default method class ");
	}
	
}
