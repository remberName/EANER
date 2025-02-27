package com.es.edu.javabasic.LZK.a_2_1;

import com.es.edu.javabasic.LZK.a_2_1.animal.Animal;
import com.es.edu.javabasic.LZK.a_2_1.animal.Bird;
import com.es.edu.javabasic.LZK.a_2_1.animal.Dog;
import com.es.edu.javabasic.LZK.a_2_1.person.Person;
import com.es.edu.javabasic.LZK.a_2_1.shape.Circle;
import com.es.edu.javabasic.LZK.a_2_1.shape.Rectangle;
import com.es.edu.javabasic.LZK.a_2_1.shape.Shape;
/**
 * [概要] <p>入口クラス。</p>
 * [説明] <p>入口クラス。</p>
 * [補充] <p>特になし。</p>
 */
public class Index {

	
	public static void main(String[] args) {
		
		// 犬クラス
		Animal dog = new Dog("桜", 0, "ワンーワン");
		// 食べる
		dog.eat();
		// 寝る
		dog.sleep();
		// 声
		dog.barking();

		// 鳥クラス
		Bird bird = new Bird("大郎", 1, "らーらー");
		// 食べる
		bird.eat();
		// 寝る
		bird.sleep();
		// 声
		bird.barking();
		// 飛ぶ
		bird.fly();
        
		// Shapeクラス
		Shape shape1 = new Circle();  
        Shape shape2 = new Rectangle();  
        
        shape1.draw();
        shape2.draw();
        
        // Personクラス
        Person person = new Person("田中",20,1,"東京");
        System.out.println(person.toString());
	}

}
