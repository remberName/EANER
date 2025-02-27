package com.es.edu.javabasic.LZK.a_1_4;

/**
 * [概要] <p>猫クラス。</p>
 * [詳細] <p>動物クラスから継承した猫クラス。</p>
 * [補充] <p>特になし。</p>
 */
public class Cat extends AnimalAbstract {
	
	public Cat(String name, int sex, String specie) {
		super(name, sex, specie);
	}

	/**
	 * [概要] <p>猫の声を出力メソッド。</p>
	 * [詳細] <p>猫の声が出力。</p>
	 * [補充] <p>特になし。</p>
	 */
	@Override
	public void animalBarking() {
		
		System.out.println("名前は"+super.getName()+"の声は"+super.getSpecie());
		
	}
}
