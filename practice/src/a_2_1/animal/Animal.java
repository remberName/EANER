package a_2_1.animal;
/**
 * [概要] <p>動物抽象クラス。</p>
 * [説明] <p>動物抽象クラス。</p>
 * [補充] <p>特になし。</p>
 */
public abstract class Animal {

	/**
	 * 名前
	 */
	private String name;
	
	/**
	 * 性別
	 */
	private int sex;
	
	/**
	 * 動物声
	 */
	private String sound;
	
	public Animal() {
		super();
	}

	public Animal(String name, int sex, String sound) {
		super();
		this.name = name;
		this.sex = sex;
		this.sound = sound;
	}

	/**　
	 * [概要] <p>動物の声。</p>
	 * [説明] <p>動物の声。</p>
	 * [補充] <p>特になし。</p>
	 *
	 */
	public void barking() {
		System.out.println(this.name+"の声は"+this.sound);
	}
	
	/**　
	 * [概要] <p>動物食べる。</p>
	 * [説明] <p>動物食べる。</p>
	 * [補充] <p>特になし。</p>
	 *
	 */
	public abstract void eat();
	
	
	/**
	 * [概要] <p>動物寝る。</p>
	 * [説明] <p>動物寝る。</p>
	 * [補充] <p>特になし。</p>
	 *
	 */
	public abstract void sleep();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}
	
}
