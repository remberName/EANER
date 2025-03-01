package com.es.edu.javabasic.LZK.a_3_2.java21.sealedinterface;

/**
 * [概要] <p>Carクラス。</p>
 * [説明] <p>シールクラス練習。</p>
 * [補充] <p>このクラスは車インターフェースに継承して、バスだけに継承できる。</p>
 */
public sealed class Car implements VehicleImp permits Bus{

	@Override
	public void run() {
		System.out.println("this is car run method");
	}

	public void sped() {
		System.out.println("this is car spead");
	}
}
