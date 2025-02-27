package com.es.edu.javabasic.LZK.a_2_4.sort;

/**
 * [概要] <p>クイックソートクラス。</p>
 * [説明] <p>クイックソートクラス。</p>
 * [補充] <p>特になし。</p>
 */
public class QuickSort {
	
	/**
	 * [概要] <p>クイックソートメソッド。</p>
	 * [説明] <p>クイックソートメソッド。</p>
	 * [補充] <p>特になし。</p>
	 *
	 * @param list　配列
	 * @param start　開始位置
	 * @param end　終了位置
	 */
	public void quickSort(int[] list,int start,int end){
		if(start < end) {
			// 参照要素
			int target = list[end];
			// 交換位置
			int replacPosition = start -1;
			for(int i = start;i < end ;i++) {
				if(list[i] < target) {
					replacPosition++;
					int temp = list[i];
					list[i] = list[replacPosition];
					list[replacPosition] = temp;
				}
			}
			
			// 参照要素位置を更新
			int tempNum = list[replacPosition+1];
			list[replacPosition +1] = list[end];
			list[end] = tempNum;
			replacPosition++;
			
			// 左側の配列
			quickSort(list, start, replacPosition - 1);
			// 右側の配列
			quickSort(list, replacPosition + 1, end);
		}
	}
}
