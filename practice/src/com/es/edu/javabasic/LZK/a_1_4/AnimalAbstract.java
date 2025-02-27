package com.es.edu.javabasic.LZK.a_1_4;

/**
 * [概要] <p>動物クラス。</p>
 * [詳細] <p>動物親クラス。</p>
 * [補充] <p>特になし。</p>
 */
public abstract class AnimalAbstract {
	
	/**
	 * 名前
	 */
	private String name;
	
	/**
	 * 性別
	 */
	private int sex;
	
	/**
	 * 種類
	 */
	private String specie;

	public AnimalAbstract(String name, int sex, String specie) {
		super();
		this.name = name;
		this.sex = sex;
		this.specie = specie;
	}
	
	/**
	 * [概要] <p>動物の声を出力メソッド。</p>
	 * [詳細] <p>動物の声が出力。</p>
	 * [補充] <p>特になし。</p>
	 */
	public abstract void animalBarking();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public String getSpecie() {
		return specie;
	}

	public void setSpecie(String specie) {
		this.specie = specie;
	}
}
