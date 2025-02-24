package a_2_3;

import java.math.BigDecimal;

/**
 * [概要] <p>銀行口座クラス。</p>
 * [説明] <p>銀行口座クラス。</p>
 * [補充] <p>特になし。</p>
 */
public class BankAccount {
	
	/**
	 * 残高
	 * デフォルト値：0.00
	 */
	private Double balance = 0.00;
	
	public BankAccount(Double balance) {
		this.balance = balance;
	}

	public Double getBalance() {
		return balance;
	}
	
	/**
	 * [概要] <p>引き出しメソッド。</p>
	 * [説明] <p>引き出しメソッド。</p>
	 * [補充] <p>特になし。</p>
	 *
	 * @param amount 引き出し金額
	 * @return　引き出した後残高
	 */
	public void withdraw(int amount) {

		// 残高より多い場合
		if (amount > balance) {
			System.out.println("残高不足です。");
		} else {
			// 残高より少ない場合
			this.balance = this.balance - amount;
			
			// 数字大きすぎるため、BigDecimalに変換する
			BigDecimal bigDecimal = new BigDecimal(balance);
			// 引き出した後残高
			System.out.println("残高：" +bigDecimal.toPlainString());
		}
	}
}
