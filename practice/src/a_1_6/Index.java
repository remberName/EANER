package a_1_6;

/**
 * [概要] <p>演習A-1-6の入口クラス。</p>
 * [説明] <p>演習プログラムのロジック。</p>
 * [補充] <p>特になし。</p>
 */
public class Index {

	/**
	 * [概要] <p>ロジックメソッド。</p>
	 * [説明] <p>Mainメソッド。</p>
	 * [補充] <p>特になし。</p>
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		
		// データ管理クラス
		DataOperation dataManagement = new DataOperation();
		// データ読み込みクラス
		FileOperation fileManipulation = new FileOperation();
		// 文字列操作クラス
		StringOperation manipulation = new StringOperation();
		
		// メソッド呼び出す
		dataManagement.logic();
		manipulation.logic();
		fileManipulation.logic();
		
		
	}

}
