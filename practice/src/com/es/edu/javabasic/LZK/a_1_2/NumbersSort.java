package com.es.edu.javabasic.LZK.a_1_2;

import java.util.Arrays;

/**
 * [概要] <p>配列ソートクラス。</p>
 * [詳細] <p>配列のソート（バブルソート）。</p>
 * [補充] <p>特になし。</p>
 */
public class NumbersSort {

	/**
     * [概要] <p>配列のソート（バブルソート）。</p>
	 * [詳細] <p>配列を使ったソート。</p>
	 * [補充] <p>特になし。</p>
	 */
	public void numSort() {
		System.out.println("""
				配列は以下になる
				1 10 15 40 19 0 12 28 16,13 92 -1 63 100100
				----------------------""");
		
		// 引数を設定する
		int[] numbers = {1,10,15,40,19,0,12,28,16,13,92,-1,63,100_100};
		
		// 配列のすべての要素を繰り返し比較
		for(int i = 0;i < numbers.length;i++) {
			
			// 最後の i 個はソート済みなので、それを除いた部分を比較
			for(int j = 0; j < numbers.length - i - 1; j++) {
				
				// 隣接する要素を比較し、順番が逆なら交換
                if (numbers[j] > numbers[j + 1]) {
                	
                    // 要素の交換
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
			}
		}
		
		// ソート下の配列は出力する
		Arrays.stream(numbers).forEach(num->System.out.print(num+" "));
		// 改行する
		System.out.println();
	}
}
