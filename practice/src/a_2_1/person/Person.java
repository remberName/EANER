package a_2_1.person;
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
	 * 年齢
	 */
	private int age;
	
	/**
	 * 性別
	 */
	private int sex;
	
	/**
	 * アドレス
	 */
	private String address;

	public Person(String name, int age, int sex, String address) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.address = address;
	}

	public Person() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		if(this.sex==1) {
			return "男";
		}
			return "女";
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", sex=" + sex + ", address=" + address + "]";
	}
	
}
