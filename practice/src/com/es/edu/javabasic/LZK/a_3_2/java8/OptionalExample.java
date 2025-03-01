package com.es.edu.javabasic.LZK.a_3_2.java8;

import java.util.Optional;

/**
 * [概要] <p>Optional演習クラス。</p>
 * [説明] <p>Optional演習クラス。</p>
 * [補充] <p>特になし。</p>
 */
public class OptionalExample {
	
	/**
	 * [概要] <p>Optionalクラスのメソッド演習。</p>
	 * [説明] <p>Optionalクラスのメソッド演習。</p>
	 * [補充] <p>特になし。</p>
	 *
	 */
	public void optionalExample() {
		
		String nullStr = null;
		String str = "test string and sea hello";
		
		/**
		 * of(T value)
		 * 値が null でない場合に Optional を作成する
		 * null を渡すと NullPointerException をスローする
		 */
		Optional<String> optional = Optional.of(str);
		System.out.println(optional.toString());
		
		/**
		 * ofNullable(T value)
		 * 値が null の場合でも Optional.empty() を返す
		 * 値が null でない場合は、その値を含む Optional を返す
		 */
		Optional<String> optional2 = Optional.ofNullable(nullStr);
		System.out.println(optional2.toString());
		
		Optional<String> optional3 = Optional.ofNullable(str);
		System.out.println(optional3.toString());
		
		/**
		 * empty()
		 * 空のOptionalを返す（値は存在しないことを意味する）
		 */
		Optional<String> optional4 = Optional.empty();
		System.out.println(optional4.toString());
		
		/**
		 * isPresent()
		 * 値が存在する場合 true を返す
		 * 
		 * get()
		 * Optional に値が含まれていればその値を返す
		 * 値がない場合に NoSuchElementException をスローする
		 */
		Optional<String> optional5 = Optional.of(str);
		if(optional5.isPresent()) {
			System.out.println(optional5.get());
		}
		
		/**
		 * orElse(T other)
		 * 値が存在する場合はその値を返し、存在しない場合は指定した代替値を返す
		 */
		Optional<String> optional6 = Optional.of(str);
		String value = optional6.orElse("aaaa");
		System.out.println(value);
		
		/**
		 * orElseThrow(Supplier<? extends X> exceptionSupplier)
		 * 値が存在しない場合に指定された例外をスローする
		 */
		Optional<String> optional7 = Optional.of(str);
		try {
			String value1 = optional7.orElseThrow(()-> new IllegalArgumentException("value is null"));
		} catch (IllegalArgumentException e) {
			System.out.println("例外をスローする");
		}

	}

}
