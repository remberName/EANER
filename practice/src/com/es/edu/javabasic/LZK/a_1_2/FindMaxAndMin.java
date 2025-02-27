package com.es.edu.javabasic.LZK.a_1_2;

/**
 * [概要] <p>最大値・最小値の検索クラス。</p>
 * [詳細] <p>配列を使った最大値・最小値の検索。</p>
 * [補充] <p>特になし。</p>
 */
public class FindMaxAndMin {

	/**
	 * [概要] <p>最大値・最小値の検索。</p>
	 * [詳細] <p>配列を使った最大値・最小値の検索。</p>
	 * [補充] <p>特になし。</p>
	 */
	public void findValue() {
		System.out.println("""
				配列は以下になる
				1,10,15,40,15,0,12,28,16,15,92,-1,63,100100
				----------------------""");
		
		// 引数を設定する
		int[] numbers = {1,10,15,40,15,0,12,28,16,15,92,-1,63,100_100};
		
		// 最大値,初期化
		int maxNumber = numbers[0];
		// 最小値,初期化
		int minNumber = numbers[0];
				
		// 配列をループする
		for(int number : numbers) {
			
			// numberはmaｘNumberより大きい場合
			if(number > maxNumber) {
				maxNumber = number;
				
			// numberはminNumberより小さい場合
			}else if(minNumber > number) {
				minNumber = number;
			}
		}
		
		// 最大値・最小値を出力する
		System.out.println("最大値は"+maxNumber+",最小値は"+minNumber);
		
	}
}
