package com.es.edu.javabasic.LZK.a_3_2.java17;

/**
 * [概要] <p>instanceof演習クラス。</p>
 * [説明] <p>instanceof演習クラス。</p>
 * [補充] <p>特になし。</p>
 */
public class InstanceofExample {

	/**
	 * [概要] <p>instanceof演習メソッド。</p>
	 * [説明] <p>instanceof演習メソッド。</p>
	 * [補充] <p>特になし。</p>
	 *
	 */
	public void instanceofExample() {
		
		Object obj = "this is a object type data";
		
		// 文字列かどうか判断
		if(obj instanceof String objStr) {
			System.out.println(objStr.length());
		}
		
		// 数字かどうか判断
		if(obj instanceof Integer number) {
			System.out.println(number);
		}
	}
}
