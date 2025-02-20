package a_2_3;

/**
 * [概要] <p>入口クラス。</p>
 * [説明] <p>入口クラス。</p>
 * [補充] <p>特になし。</p>
 */
public class Index {

	public static void main(String[] args) {
		
		// 口座１インスタンス
		BankAccount account1 = new BankAccount(100_000_000.00);
		// 口座１引き出した
		System.out.println("口座１は100,000円を引き出し");
		account1.withdraw(100_000);
		
		// 口座２インスタンス
		BankAccount account2 = new BankAccount(1_000.00);
		// 口座２引き出し
		System.out.println("口座2は100,000円を引き出し");
		account2.withdraw(100_000);
	}

}
