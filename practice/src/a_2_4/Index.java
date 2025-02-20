package a_2_4;

import java.util.Arrays;

import a_2_4.sort.BinarySearch;
import a_2_4.sort.BubbleSort;
import a_2_4.sort.QuickSort;

/**
 * [概要] <p>入口クラス。</p>
 * [説明] <p>入口クラス。</p>
 * [補充] <p>特になし。</p>
 */
public class Index {

	public static void main(String[] args) {
		
		int listSize = 10;
		
		// バブルソートクラス
		BubbleSort bubbleSort = new BubbleSort();
		// クイックソートクラス
		QuickSort quickSort = new QuickSort();
		// 二分探索クラス
		BinarySearch binarySearch = new BinarySearch();
		
		// バブルソート配列
		int[] bubbleSortList = new int[listSize];
		// クイックソート配列
		int[] quickSortList = new int[listSize];

		// 配列要素を生成
		for (int i = 0; i < listSize; i++) {
			int randomNum = (int) (Math.random() * 100);
			bubbleSortList[i] = randomNum;
			quickSortList[i] = randomNum;
		}

		System.out.println(Arrays.toString(quickSortList));
		// 実行開始時間
		long bubbleSortStartTime = System.nanoTime();
		bubbleSort.bubbleSort(bubbleSortList);
		// 実行終了時間
		long bubbleSortEndTime = System.nanoTime();
		// 実行時間
		long bubbleSortDuration = bubbleSortEndTime - bubbleSortStartTime;
		// 実行時間を出力
		System.out.println("bubbleSortの実行時間：" + bubbleSortDuration + "nanoseconds");
		
		// 実行開始時間
		long quickSortStartTime = System.nanoTime();
		quickSort.quickSort(quickSortList, 0, quickSortList.length-1);
		// 実行終了時間
		long quickSortEndTime = System.nanoTime();
		// 実行時間
		long duration = quickSortEndTime - quickSortStartTime;
		// 実行時間を出力
		System.out.println("quickSortの実行時間：" + duration + "nanoseconds");
		
		// 二分探索メソッド
		System.out.println(Arrays.toString(quickSortList)+"--->"+ quickSortList[listSize/2]);
		int index = binarySearch.binarySeach(quickSortList, quickSortList[listSize/2], 0, quickSortList.length);
		System.out.println(index);
	}
}
