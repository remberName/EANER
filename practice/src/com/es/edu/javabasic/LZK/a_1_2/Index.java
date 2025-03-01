package com.es.edu.javabasic.LZK.a_1_2;

import java.util.Scanner;


/**
 * [概要] <p>基本文法演習クラス。</p>
 * [詳細] <p>演習プログラムのロジック</p>
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
		
		// 最大値・最小値の検索クラス
		FindMaxAndMin findMaxAndMin = new FindMaxAndMin();
		// 変数を使った計算クラス
		FourRulesOfArithmetic fourRulesOfArithmetic = new FourRulesOfArithmetic();
		// 繰り返し処理クラス
		Multiplication multiplication = new Multiplication();
		// 配列ソートクラス
		NumbersSort numbersSort = new NumbersSort();
		// 成績判定クラス
		PreformanceEvaluation preformanceEvaluation = new PreformanceEvaluation();
		
		// Scannerオブジェクトを作成して、入力を受け取る
		try(Scanner scanner = new Scanner(System.in)) { // TRY-WITH-RESOUCRS
			while(true) {
				// 演習メニュー
				System.out.print("""
						1.変数を使った計算プログラム（四則演算）
						2.条件分岐（if, switch）を使った判定プログラム
						3.繰り返し処理を用いた九九の表示
						4.配列を使った最大値・最小値の検索
						5.配列のソート（バブルソート）
						6.プログラム終了
						数字を入力して下さい:""");
				
				// 入力した番号を受け取る
				try {
					
					// メニュー番号を取得する
					int menuNum = Integer.parseInt(scanner.next());
					
					switch (menuNum) {
						// 変数を使った計算プログラム（四則演算）
						case 1:
							fourRulesOfArithmetic.calculation();
							break;
							
							// 条件分岐（if, switch）を使った判定プログラム
						case 2:	
							preformanceEvaluation.judgement();
							break;
							
							// 繰り返し処理を用いた九九の表示
						case 3:
							multiplication.multiplicationTable();
							break;
							
							// 配列を使った最大値・最小値の検索
						case 4:
							findMaxAndMin.findValue();
							break;
							// 配列のソート（バブルソート）
						case 5:
							numbersSort.numSort();
							break;
							
							// プログラム終了
						case 6:
							System.out.println("プログラム終了");
							System.exit(0);
							
							// 他の数字
						default:
							System.out.println("1から6までに入れてください");
							break;
					}
					// 数字以外の文字なら例外になる
				} catch (NumberFormatException e) {
					System.out.println("数字を入れてください。");
				} catch (Exception e) {
					System.out.println("異常が発生しました。");
					System.exit(9);
				}
			}
		} finally {
		}
	}
}
