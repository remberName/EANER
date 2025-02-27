package com.es.edu.javabasic.LZK.a_2_1.animal;

/**
 * [概要] <p>鳥クラス。</p>
 * [説明] <p>鳥クラス。</p>
 * [補充] <p>特になし。</p>
 */
public class Bird extends Animal implements Flyable {

	public Bird(String name, int sex, String sound) {
		super(name, sex, sound);
	}

	/**
	 * [概要] <p>動物飛び。</p>
	 * [説明] <p>動物飛び。</p>
	 * [補充] <p>特になし。</p>
	 *
	 */
	@Override
	public void fly() {
		System.out.println("この鳥を飛んでる。");
		
	}

	/**　
	 * [概要] <p>動物食べる。</p>
	 * [説明] <p>動物食べる。</p>
	 * [補充] <p>特になし。</p>
	 *
	 */
	@Override
	public void eat() {
		System.out.println("この鳥は"+getName()+",今食べてる。");
	}

	/**
	 * [概要] <p>動物寝る。</p>
	 * [説明] <p>動物寝る。</p>
	 * [補充] <p>特になし。</p>
	 *
	 */
	@Override
	public void sleep() {
		System.out.println("この鳥は"+getSex()+",今寝てる。");
	}

}
