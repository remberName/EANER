package a_2_2;

/**
 * [概要] <p>Box共通クラス。</p>
 * [説明] <p>Box共通クラス。</p>
 * [補充] <p>特になし。</p>
 */
public class Box<T> {
	
	/**
	 * アイテム
	 */
	private T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}

}
