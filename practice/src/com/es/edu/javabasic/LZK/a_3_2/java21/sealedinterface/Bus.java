package com.es.edu.javabasic.LZK.a_3_2.java21.sealedinterface;

/**
 * [概要] <p>バスクラス。</p>
 * [説明] <p>シールクラス演習。</p>
 * [補充] <p>Carインターフェース継承して、他のクラスはBusクラス継承できず。</p>
 */
public final class Bus extends Car {

	@Override
	public void run() {
		System.out.println("this is bus run method");
	}

	@Override
	public void sped() {
		System.out.println("this is bus sped method");
	}
}
