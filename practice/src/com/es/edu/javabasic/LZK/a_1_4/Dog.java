package com.es.edu.javabasic.LZK.a_1_4;

/**
 * [概要] <p>犬クラス。</p>
 * [詳細] <p>動物クラスから継承した犬クラス。</p>
 * [補充] <p>特になし。</p>
 */
public class Dog extends AnimalAbstract{
	
	public Dog(String name, int sex, String specie) {
		super(name, sex, specie);
	}

	/**
	 * [概要] <p>犬の声を出力メソッド。</p>
	 * [詳細] <p>犬の声が出力。</p>
	 * [補充] <p>特になし。</p>
	 */
	@Override
	public void animalBarking() {
		
		System.out.println("名前は"+super.getName()+"の声は"+super.getSpecie());
		
	}
}
