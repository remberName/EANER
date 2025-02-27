package com.es.edu.javabasic.LZK.a_1_4;

/**
 * [概要] <p>冷蔵庫クラス。</p>
 * [詳細] <p>電気実装クラス。</p>
 * [補充] <p>特になし。</p>
 */
public class Refrigerator implements AppliancesIF {
	
	@Override
	public void whoAmI() {
		System.out.println("この"+appliancesName+"は冷蔵庫です。");
	}

	@Override
	public void getName() {
		System.out.println("冷蔵庫");
	}
}
