package com.es.edu.javabasic.LZK.a_3_2.java8;

import com.es.edu.javabasic.LZK.a_3_2.datasources.DataSources;

/**
 * [概要] <p>ラムダ式演習クラス。</p>
 * [説明] <p>ラムダ式演習クラス。</p>
 * [補充] <p>特になし。</p>
 */
public class LambdaExpressions {
	
	/**
	 * [概要] <p>ラムダ基本式メソッド。</p>
	 * [説明] <p>ラムダ基本式メソッド。</p>
	 * [補充] <p>特になし。</p>
	 *
	 */
	public void LambdaExample(){
		
		// ラムダ式使って、リストを出力する
		DataSources.getNumberList().forEach(number -> System.out.println(number));
	}
	
	/**
	 * [概要] <p>引数なしラムダ式メソッド。</p>
	 * [説明] <p>引数なしラムダ式メソッド。</p>
	 * [補充] <p>特になし。</p>
	 *
	 */
	public void noArgsLambdaExample() {
		
		// 一行だけの引数なしラムダ式
		Runnable noArgsOne = () -> System.out.println("引一行だけの引数なしラムダ式を実行しました");
		noArgsOne.run();

		// 複行の引数なしラムダ式
		Runnable noArgsTwo = () -> {
			int i = 0;
			System.out.println(++i);
			System.out.println("複行の引数なしラムダ式を実行しました");
		};
		noArgsTwo.run();
	}
	
	/**
	 * [概要] <p>複数引数ラムダ式メソッド。</p>
	 * [説明] <p>複数引数ラムダ式メソッド。</p>
	 * [補充] <p>特になし。</p>
	 *
	 */
	public void MultipleArgsLambdaExample() {

		// 複数引数ラムダ式用インターフェース
		SumNumArray sumNumArray = (a, b) -> {
			return a + b;
		};

		// 結果を出力する
		for (int[] numArray : DataSources.getTwodimenarray()) {
			System.out.println(sumNumArray.operation(numArray[0], numArray[1]));
		}
	}
	
	/**
	 * [概要] <p>複数引数ラムダ式用インターフェース。</p>
	 * [説明] <p>複数引数ラムダ式用インターフェース。</p>
	 * [補充] <p>特になし。</p>
	 */
	interface SumNumArray {
		int operation(int a, int b);
	}
	
}
