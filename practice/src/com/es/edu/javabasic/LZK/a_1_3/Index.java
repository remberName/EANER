package com.es.edu.javabasic.LZK.a_1_3;

import java.util.Scanner;

/**
 * [概要] <p>メソッドとオブジェクト指向演習クラス。</p>
 * [詳細] <p>演習プログラムのロジック。</p>
 * [補充] <p>特になし。</p>
 */
public class Index {

	/**
	 * [概要] <p>アプリケーションの入口メソッド。</p>
	 * [詳細] <p>処理の大きな流れのロジック。</p>
	 * [補充] <p>特になし。</p>
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Carクラス
		Car car = new Car();
		// 計算クラス
		MathCalculate mathCalculate = new MathCalculate();

		// Scannerオブジェクトを作成して、入力を受け取る
		try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
				// 演習メニュー
				System.out.println("""
						1.変数を使った計算プログラム（四則演算）
						2.Car対象
						3.残高の入出金を管理
						4.プログラム終了
						数字を入力して下さい:""");

				// 入力した番号を受け取る
				try {

					// メニュー番号を取得する
					int menuNum = Integer.parseInt(scanner.next());

					switch (menuNum) {
					// 変数を使った計算プログラム（四則演算）
					case 1:
						mathCalculate.calculation(10, 20, 21.1, 100.00);
						break;

					// Car対象
					case 2:

						car.setCarColor("blue");
						car.setCarName("toyota");
						car.setCarOrigin("japan");
						car.setCarPrice(20_000_00);
						System.out.println(car.toString());
						break;

					// 残高の入出金を管理
					case 3:
						// 残高管理クラス
						BankAccount bankAccount = new BankAccount(2_000.00);
						// 引き出し
						bankAccount.withdraw(1_000.00);
						// 残高確認
						bankAccount.displayAccountInfo();
						// 預金
						bankAccount.deposit(10_000);
						// 残高確認
						bankAccount.displayAccountInfo();
						break;

					// プログラム終了
					case 4:
						System.out.println("プログラム終了");
						System.exit(0);

						// 他の数字
					default:
						System.out.println("1から4までに入れてください");
						break;
					}

					// 数字以外の文字なら例外になる
				} catch (Exception e) {
					System.out.println("数字を入れてください");
				}
			}

			// 異常処理
		} catch (Exception e) {
			System.out.println("プログラム異常");
		}

	}

}
