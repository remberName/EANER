package a_2_2;

/**
 * [概要] <p>ペットインターフェース。</p>
 * [説明] <p>ペットインターフェース。</p>
 * [補充] <p>特になし。</p>
 */
public interface Pet {
	
	/**
	 * [概要] <p>移動抽象メソッド。</p>
	 * [説明] <p>移動抽象メソッド。</p>
	 * [補充] <p>特になし。</p>
	 *
	 */
	void move();

	/**
	 * [概要] <p>食べるメソッド。</p>
	 * [説明] <p>食べるメソッド。</p>
	 * [補充] <p>特になし。</p>
	 *
	 */
	public default void eat() {
		System.out.println("このPetは餌を食べてる");
	};
}
