package a_2_4.sort;

/**
 * [概要] <p>二分探索クラス。</p>
 * [説明] <p>二分探索クラス。</p>
 * [補充] <p>特になし。</p>
 */
public class BinarySearch {

	/**
	 * [概要] <p>二分探索メソッド。</p>
	 * [説明] <p>二分探索メソッド。</p>
	 * [補充] <p>特になし。</p>
	 *
	 * @param list　ソート後配列
	 * @param target　目標要素
	 * @param start　開始index
	 * @param end　終了index
	 * @return 要素index
	 */
	public int binarySeach(int[] list, int target, int start, int end) {

		// 見つけない
		if (start > end) {
			return -1;
		}

		// 真中のindexを計算
		int mid = (end - start) / 2;

		// 見つかった場合
		if (list[mid] == target) {
			return mid;
		}

		// 左の場合
		if (list[mid] > target) {
			return binarySeach(list, target, start, mid - 1);
		} else {
			// 右の場合
			return binarySeach(list, target, mid + 1, end);
		}

	}
}
