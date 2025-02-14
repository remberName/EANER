package a_2_2;

/**
 * [概要] <p>プログラム入口。</p>
 * [説明] <p>プログラム入口。</p>
 * [補充] <p>特になし。</p>
 */
public class Index {

	public static void main(String[] args) {
		
		// 犬クラス
		Animal dog = new Dog();
		dog.sound();
		
		// 猫クラス
		Animal cat = new Cat();
		cat.sound();
		
		// 形クラス
		Shape[] shapes = {new Circle(),new Rectangle()};
		for(Shape shape : shapes) {
			shape.draw();
		}
		
		// Personクラス
		Person person = new Person("七海", 0, 20);
		boolean b = person.equals(new Person("七海", 0, 20));
		System.out.println(b);
		System.out.println(person.hashCode());
		System.out.println(person.toString());
		
		// Boxクラス
		Box<String> strBox = new Box<>();
		strBox.setItem("abc");
		System.out.println(strBox.getItem());
		
		Box<Integer> intBox = new Box<>();
		intBox.setItem(100);
		System.out.println(intBox.getItem());
		
		Box<?> whatBox = new Box<>();
		whatBox = strBox;
		System.out.println(whatBox.getItem());
		
		// pigクラス
		Pet pig = new Pig();
		pig.eat();
		pig.move();
		
		// リスクラス
		Pet squirrel = new Squirrel();
		squirrel.eat();
		squirrel.move();
		
		// ボクシング、アンボクシング
		int a = 10;
		Integer c = a;
		System.out.println(c);
		
		int d = c;
		System.out.println(d);
		
	}

}
