package com.es.edu.javabasic.LZK.a_1_5;

/**
 * [概要] <p>残高管理クラス。</p>
 * [詳細] <p>残高の入出金を管理するクラス。</p>
 * [補充] <p>特になし。</p>
 */
public class BankAccountException {
	
	/**
	 * 残高
	 */
	private double balance; 

    public double getBalance() {
        return balance;
    }
    
    public BankAccountException(double initialBalance) {
    	
    	// 初期残高確認
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
            System.out.println("初期残高は0以上でなければなりません。残高は0に設定されました。");
        }
    }

    /**
     * [概要] <p>預金メソッド。</p>
     * [詳細] <p>預金。</p>
     * [補充] <p>特になし。</p>
     * 
     * @param amount　預金額
     */
    public void deposit(double amount) {
    	
        try {
        	if (amount > 0) {
                balance += amount;
                System.out.println(amount + "円が預金されました。");
            } else {
               throw new InsufficientBalanceException("預金額は正の数でなければなりません。");
            }
        }catch (InsufficientBalanceException e) {
			e.printStackTrace();
		}
    }

    /**
     * [概要] <p>引き出しメソッド。</p>
     * [詳細] <p>引き出し。</p>
     * [補充] <p>特になし。</p>
     * 
     * @param amount　引き出し額
     */
    public void withdraw(double amount) {
    	try{
    		if (amount > 0) {
                if (amount <= balance) {
                    balance -= amount;
                    System.out.println(amount + "円が引き出されました。");
                } else {
                    System.out.println("残高不足です。");
                }
            } else {
                throw new InsufficientBalanceException("預金額は正の数でなければなりません。");
            }
    	}catch (InsufficientBalanceException e) {
			e.printStackTrace();
		}
    }

    /**
     * [概要] <p>口座情報を表示するメソッド。</p>
     * [詳細] <p>残高出力。</p>
     * [補充] <p>特になし。</p>
     */
    public void displayAccountInfo() {
        System.out.println("現在の残高: " + balance + "円");
    }
	
}
