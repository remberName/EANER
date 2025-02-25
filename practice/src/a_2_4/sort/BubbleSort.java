package a_2_4.sort;

/**
 * [概要] <p>バブルソートクラス。</p>
 * [説明] <p>バブルソートクラス。</p>
 * [補充] <p>特になし。</p>
 */
public class BubbleSort {

	/**
	 * [概要] <p>バブルソートメソッド。</p>
	 * [説明] <p>バブルソートメソッド。</p>
	 * [補充] <p>特になし。</p>
	 *
	 * @param list　ソート後の配列
	 */
	public void bubbleSort(int[] list) {
		int length = list.length;
		for (int i = 0; i < length - 1; i++) {
			for (int j = 0; j < length - i - 1; j++) {
				if (list[j] > list[j + 1]) {
					int num = list[j + 1];
					list[j + 1] = list[j];
					list[j] = num;
				}
			}
		}
	}
}
