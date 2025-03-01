package com.es.edu.javabasic.LZK.a_3_2.java17.sealedclasses;

/**
 * [概要] <p>Carクラス。</p>
 * [説明] <p>シールクラス練習。</p>
 * [補充] <p>このクラスは車クラスに継承して、バスだけに継承できる。</p>
 */
public sealed class Car extends Vehicle permits Bus{

	@Override
	public void run() {
		System.out.println("this is car run method");
	}

	public void sped() {
		System.out.println("this is car spead");
	}
}
