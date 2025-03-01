package com.es.edu.javabasic.LZK.a_3_2.datasources;

import java.util.Arrays;
import java.util.List;

/**
 * [概要] <p>演習用データクラス。</p>
 * [説明] <p>演習用データクラス。</p>
 * [補充] <p>特になし。</p>
 */
public class DataSources {

	/**
	 * 数字リストデータ
	 */
	private static final List<Integer> numberList = Arrays.asList(1,2,3,4,5,6,7,8,9,0,1);

	/**
	 * 文字列リストデータ
	 */
	private static final List<String> stringList = Arrays.asList("花","水","風","木","雪","月","火","光","土"); 
	
	/**
	 * 二次元配列
	 */
	private static final int[][] twoDimenArray = new int[][] {
		{1,2},{3,4},{4,5},{6,7},{7,8},{8,9},{9,10},{1,0},{2,8}
	};
	
	/**
	 * [概要] <p>リスト要素を追加メソッド。</p>
	 * [説明] <p>リスト要素追加メソッド。</p>
	 * [補充] <p>特になし。</p>
	 *
	 */
	public static void addList() {
		// 十万行データを追加
		for (int i = 100_000; i > 0; i--) {
			DataSources.getNumberList().add(i);
		}
	}
	
	/**
	 * [概要] <p>リスト要素を削除メソッド。</p>
	 * [説明] <p>リスト要素を削除メソッド。</p>
	 * [補充] <p>特になし。</p>
	 *
	 */
	public static void deleteList() {
		// 十万行データを削除
		for (int i = 100_000; i > 0; i--) {
			DataSources.getNumberList().remove(i);
		}
	}

	public static List<Integer> getNumberList() {
		return numberList;
	}

	public static List<String> getStringlist() {
		return stringList;
	}

	public static int[][] getTwodimenarray() {
		return twoDimenArray;
	}
	
	
}
