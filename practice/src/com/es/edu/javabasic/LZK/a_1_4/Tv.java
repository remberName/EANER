package com.es.edu.javabasic.LZK.a_1_4;

/**
 * [概要] <p>テレビクラス。</p>
 * [詳細] <p>電気実装クラス。</p>
 * [補充] <p>特になし。</p>
 */
public class Tv implements AppliancesIF {
	
	@Override
	public void whoAmI() {
		System.out.println("この"+appliancesName+"はテレビです。");
	}

	@Override
	public void getName() {
		System.out.println("テレビ");
	}
}
