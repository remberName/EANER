package com.es.edu.javabasic.LZK.a_1_4;

import java.util.Scanner;

/**
 * [概要] <p>演習課題入口クラス。</p>
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

		// Personクラス
		Person person = new Person("斎藤","不明","京都","012-3456-7890");
		// 犬クラス
		Dog dog = new Dog("太郎", 0, "ワンワン");
		// 猫クラス
		Cat cat = new Cat("五郎", 0, "ニャーニャー");
		// 電気クラス
		AppliancesIF tv = new Tv();
		AppliancesIF refrigerator = new Refrigerator();

		// Scannerオブジェクトを作成して、入力を受け取る
		try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
				// 演習メニュー
				System.out.println("""
						1.person演習
						2.犬
						3.猫
						4.電気
						5.プログラム終了
						数字を入力して下さい:""");

				// 入力した番号を受け取る
				try {

					// メニュー番号を取得する
					int menuNum = Integer.parseInt(scanner.next());

					switch (menuNum) {
					// Person演習
					case 1:
						System.out.println(person.toString());
						break;

					// 犬
					case 2:
						dog.animalBarking();
						break;

					// 猫
					case 3:
						cat.animalBarking();
						break;
					// 電気
					case 4:
						tv.whoAmI();
						refrigerator.whoAmI();
						new Index().getName(tv);
						new Index().getName(refrigerator);
						break;
						
					// プログラム終了
					case 5:
						System.out.println("プログラム終了");
						System.exit(0);

						// 他の数字
					default:
						System.out.println("1から5までに入れてください");
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
	
	public void getName(AppliancesIF app) {
		app.getName();
	}
}
