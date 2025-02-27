package com.es.edu.javabasic.LZK.a_1_4;

/**
 * [概要] <p>カプセル化されたPersonクラス。</p>
 * [詳細] <p>カプセル化されたPerson演習。</p>
 * [補充] <p>特になし。</p>
 */
public class Person {

	/**
	 * 名前
	 */
	private String name;
	
	/**
	 * 性別
	 */
	private String sex;
	
	/**
	 * 住所
	 */
	private String address;
	
	/**
	 * 電話番号
	 */
	private String phoneNumber;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Person(String name, String sex, String address, String phoneNumber) {
		super();
		this.name = name;
		this.sex = sex;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	public Person() {
		super();
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", sex=" + sex + ", address=" + address + ", phoneNumber=" + phoneNumber
				+ ", 電話番号が持っているかどうか：" + (hasPhoneNumber() ? "あり" : "なし") + "]";
	}
	
	/**
	 * カプセル化メソッド
	 * @return 電話持っているかどうか返却
	 */
	public boolean hasPhoneNumber() {
		return this.phoneNumber != null && !this.phoneNumber.equals("");
	}
}
