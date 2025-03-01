package com.es.edu.javabasic.LZK.a_1_5;

/**
 * [概要] <p>演習課題入口クラス。</p>
 * [詳細] <p>演習プログラムのロジック。</p>
 * [補充] <p>特になし。</p>
 */
public class Index {

	/**
	 * [概要] <p>アプリケーションの入口メソッド。</p>
	 * [詳細] <p>処理の大きな流れのロジック。</p>
	 * [補充] <p>特になし。</p>
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// 残高管理クラス
		BankAccountException bankAccountException = new BankAccountException(1_000.00);
		bankAccountException.withdraw(-1);
		
		// ArithmeticException練習クラス
		NumberExceptionTest exceptionTest=new NumberExceptionTest();
		exceptionTest.exceptionThrow();
		
		// ファイル読み込むクラス
		LoadFileTest fileTest = new LoadFileTest();
		fileTest.getFile();
	}
}
