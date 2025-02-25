package a_2_2.person;

import java.util.Objects;

/**
 * [概要] <p>Personクラス。</p>
 * [説明] <p>Personクラス。</p>
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
	 * 年齢
	 */
	private int age;

	public Person(String name, int sex, int age) {
		super();
		this.name = name;
		if (sex == 1)
			this.sex = "男";
		else
			this.sex = "女";
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(int sex) {
		if (sex == 1)
			this.sex = "男";
		else
			this.sex = "女";
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name, sex);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(name, other.name) && Objects.equals(sex, other.sex);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", sex=" + sex + ", age=" + age + "]";
	}
	
}
