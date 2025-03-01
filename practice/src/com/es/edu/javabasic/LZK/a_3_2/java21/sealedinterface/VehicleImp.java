package com.es.edu.javabasic.LZK.a_3_2.java21.sealedinterface;

/**
 * [概要] <p>車クラス。</p>
 * [説明] <p>シールクラス練習クラス。</p>
 * [補充] <p>CarクラスとBikeクラスだけ継承できる。</p>
 */
public sealed interface VehicleImp permits Car,Bike {
	
	/**
	 * [概要] <p>runメソッド。</p>
	 * [説明] <p>runメソッド。</p>
	 * [補充] <p>特になし。</p>
	 *
	 */
	public void run();
}
