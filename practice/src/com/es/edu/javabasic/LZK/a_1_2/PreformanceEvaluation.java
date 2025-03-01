package com.es.edu.javabasic.LZK.a_1_2;

import java.util.HashMap;
import java.util.Map;

/**
 * [概要] <p>成績判定クラス。</p>
 * [詳細] <p>条件分岐（if, switch）を使った判定プログラム</p>
 * [補充] <p>特になし。</p>
 */
public class PreformanceEvaluation {
	
	/**
	 * [概要] <p>成績判定メソッド。</p>
	 * [詳細] <p>条件分岐（if, switch）を使った判定。</p>
	 * [補充] <p>特になし。</p>
	 * @throws Exception 例外
	 */
	public void judgement() throws Exception {
		
		System.out.println("""
				引数を以下になる
				田中: 50
				山田: 60
				渡辺: 70
				斎藤: 80
				宇野: 90
				菅谷: 91
				----------------------""");
		
		// 引数を設定する
		Map<String,String> nameScore = new HashMap<String, String>();
		nameScore.put("田中", "aaa");
		nameScore.put("山田", "60");
		nameScore.put("渡辺", "70");
		nameScore.put("斎藤", "80");
		nameScore.put("宇野", "90");
		nameScore.put("菅谷", "91");

		try {
			// mapループする
			for (String name : nameScore.keySet()) {
				
				// nameに基づいて、成績を取って数字型に転換する
				int score = Integer.parseInt(nameScore.get(name));
				
				// 合格
				if (score >= 60 && score <= 80) {
					// 成績は数字から合格に変更する
					nameScore.put(name, "合格");
					
					// 良い
				} else if (score >= 81) {
					// 成績は数字から良いに変更する
					nameScore.put(name, "良い");
					
					// 不合格
				} else {
					// 成績は数字から不合格に変更する
					nameScore.put(name, "不合格");
				}
				
			}
			
			// 結果をループする
			for(String name : nameScore.keySet()) {
				//各学生の成績情報を出力する
				System.out.println(name+"の成績は"+nameScore.get(name));
			}
		} catch (NumberFormatException ex) {
			throw new Exception(ex);
		}
	}
}
