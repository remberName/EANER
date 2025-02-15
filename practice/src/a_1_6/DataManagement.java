package a_1_6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * [概要] <p>データ管理クラス。</p>
 * [説明] <p>ArrayListを使ったデータ管理クラス。</p>
 * [補充] <p>特になし。</p>
 */
public class DataManagement {
	
	private List<String> list = new ArrayList<>();
	
	/**
	 * [概要] <p>ロジックメソッド。</p>
	 * [説明] <p>rrayListを使ったデータ管理プログラムロジックメソッド。</p>
	 * [補充] <p>特になし。</p>
	 *
	 */
	public void logic() {
		// メソッドを呼び出す
		// 初期化メソッド
		init();

		// リスト展示メソッド
		System.out.println("リスト表示");
		showList();

		// データ追加メソッド
		System.out.println("\n[石原,0,22]データ追加");
		addData("石原,0,22");
		showList();

		// データ更新メソッド
		System.out.println("\n[石原,1,20]データ更新");
		updateString("石原", "石原,1,20");
		showList();

		// データ削除クラス
		System.out.println("\n石原データ削除");
		deleteString("石原");
		showList();
	}
	
	/**
	 * [概要] <p>初期化メソッド。</p>
	 * [説明] <p>データの初期化メソッド。</p>
	 * [補充] <p>特になし。</p>
	 *
	 */
	private void init() {
		
		// 初期化データ
		String str1 = "田中,0,18";
		list.add(str1);
		
		String str2 = "斎藤,1,20";
		list.add(str2);
		
		String str3 = "関口,0,19";
		list.add(str3);
		
		String str4 = "宇野,1,18";
		list.add(str4);
	}
	
	/**
	 * [概要] <p>データ追加メソッド。</p>
	 * [説明] <p>データ追加メソッド。</p>
	 * [補充] <p>特になし</p>
	 *
	 * @param str 追加データ
	 * @return　データ追加後のリスト
	 */
	private List<String> addData(String str){
		
		// データを検証する
		boolean answer = judgment(str);
		
		if (answer) {
			// データ追加
			list.add(str);
		} else {
			System.out.println("データ追加失敗しました、データの格式を確認してください。");
		}
		
		return list;
	}
	
	/**
	 * [概要] <p>データ検証メソッド。</p>
	 * [説明] <p>データ検証メソッド。</p>
	 * [補充] <p>特になし。</p>
	 *
	 * @param str 検証されるデータ
	 * @return データの形式正しいか結果
	 */
	private boolean judgment(String str) {
		
		// 「,」が存在するか判断
		int index = str.indexOf(",");
		
		// 「,」存在する場合
		if (index > 0) {
			
			// 「,」でデータを分割
			String[] splitStr = str.split(","); 
			// 性別検証
			if (splitStr[1].equals("1") || splitStr[1].equals("0")) {
				// 正規表現で年齢検証
				if (splitStr[2].matches("^(100|[1-9]?[0-9])")) {
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
			
		//存在しない場合	
		} else {
			return false;
		}
	}
	
	/**
	 * [概要] <p>要素削除メソッド。</p>
	 * [説明] <p>要素削除メソッド。</p>
	 * [補充] <p>特になし。</p>
	 *
	 * @param str 削除されたデータの名前
	 * @return 処理した後のリスト
	 */
	private List<String> deleteString(String str){
		
		// データ存在かどうかフラグ
		boolean findData = false;

		// リストをループする
		for (Iterator<String> iterator = list.iterator(); iterator.hasNext();) {

			// 要素を取る
			String string = (String) iterator.next();

			// 取った要素を「,」で分割、index[0]の要素と引数を同じか判断する
			findData = string.split(",")[0].equals(str);

			if (findData) {
				// 存在する場合は削除
				iterator.remove();

				// ループ終了
				break;
			}
		}

		// 存在しな場合は出力
		if (!findData) {
			System.out.println("削除できませんでした。入力した名前を確認してください");
		}

		return list;
	}
	
	/**
	 * [概要] <p>要素更新メソッド。</p>
	 * [説明] <p>要素更新メソッド。</p>
	 * [補充] <p>特になし。</p>
	 *
	 * @param str 更新されたデータの名前
	 * @return 処理した後のリスト
	 */
	private List<String> updateString(String str, String dataStr) {

		// データ存在かどうかフラグ
		boolean findData = false;

		// リストをループする
		for (int i = 0; i < list.size(); i++) {

			// 取った要素を「,」で分割、index[0]の要素と引数を同じか判断する
			findData = list.get(i).split(",")[0].equals(str);

			if (findData) {
				// 存在する場合は更新
				list.set(i, dataStr);

				// ループ終了
				break;
			}
		}

		// 存在しな場合は出力
		if (!findData) {
			System.out.println("更新できませんでした。入力した名前を確認してください");
		}

		return list;
	}
	
	/**
	 * [概要] <p>データ展示メソッド。</p>
	 * [説明] <p>データ展示メソッド。</p>
	 * [補充] <p>特になし。</p>
	 *
	 */
	private void showList() {
		System.out.println(list.toString());
	}
	
}
