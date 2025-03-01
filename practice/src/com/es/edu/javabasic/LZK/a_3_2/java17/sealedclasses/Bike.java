package com.es.edu.javabasic.LZK.a_3_2.java17.sealedclasses;

/**
 * [概要] <p>Bikeクラス。</p>
 * [説明] <p>シールクラス演習。</p>
 * [補充] <p>車クラスを継承して、一般的なクラスになる。</p>
 */
public non-sealed class Bike extends Vehicle {

	@Override
	public void run() {
		System.out.println("this is bike run method");
	}
}
