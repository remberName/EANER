package com.es.edu.javabasic.LZK.a_1_3;

/**
 * [概要] <p>Car対象クラス。</p>
 * [詳細] <p>Carオブジェクト。</p>
 * [補充] <p>特になし。</p>
 */
public class Car {
	
	/**
	 * 車の名前
	 */
	private String carName;
	
	/**
	 * 車の生産地
	 */
	private String carOrigin;
	
	/**
	 * 車の値段
	 */
	private double carPrice;
	
	/**
	 * 車の色
	 */
	private String carColor;

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarOrigin() {
		return carOrigin;
	}

	public void setCarOrigin(String carOrigin) {
		this.carOrigin = carOrigin;
	}

	public double getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(double carPrice) {
		this.carPrice = carPrice;
	}

	public String getCarColor() {
		return carColor;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	public Car(String carName, String carOrigin, double carPrice, String carColor) {
		super();
		this.carName = carName;
		this.carOrigin = carOrigin;
		this.carPrice = carPrice;
		this.carColor = carColor;
	}
	
	public Car() {
		super();
	}

	@Override
	public String toString() {
		return "Car [carName=" + carName + ", carOrigin=" + carOrigin + ", carPrice=" + carPrice + ", carColor="
				+ carColor + "]";
	}
	 
	
}
