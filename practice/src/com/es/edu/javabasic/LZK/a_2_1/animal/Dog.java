package com.es.edu.javabasic.LZK.a_2_1.animal;

/**
 * [概要] <p>犬クラス。</p>
 * [説明] <p>犬クラス。</p>
 * [補充] <p>特になし。</p>
 */
public class Dog extends Animal{

	public Dog(String name, int sex, String sound) {
		super(name, sex, sound);
	}
	
	/**　
	 * [概要] <p>動物食べる。</p>
	 * [説明] <p>動物食べる。</p>
	 * [補充] <p>特になし。</p>
	 *
	 */
	@Override
	public void eat() {
		System.out.println("この犬は食べてる。");
	}

	/**
	 * [概要] <p>動物寝る。</p>
	 * [説明] <p>動物寝る。</p>
	 * [補充] <p>特になし。</p>
	 *
	 */
	@Override
	public void sleep() {
		System.out.println(getName()+"は"+getSex()+",今は寝てる。");
	}

	

}
