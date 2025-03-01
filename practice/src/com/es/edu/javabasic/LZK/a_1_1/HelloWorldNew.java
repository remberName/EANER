package com.es.edu.javabasic.LZK.a_1_1;
import java.util.Arrays;

/**
 * [名称]　<p>Hello　World出力クラス。</p>
 * [説明]　<p>研修問題の答え。</p>
 * [補充]　<p>特になし。</p>
 */
public class HelloWorldNew {
	
	/**
	 * [名称]　<p>mainメソッド</p>
	 * [説明]　<p>javaプログラムの主なメソッド</p>
	 * [補充]　<p>public修飾子:mainメソッドは外部から呼ぶ出せるように公開されている必要、publicがないとJVMが認識できません。
	 * 		　　static修飾子:main メソッドはインスタンスを作成せずに呼び出されるため、インスタンス化せずに直接呼び出せる必要があります。
	 * 		　　void修飾子:main メソッドはただプログラムを実行するためのものなので戻り値は必要ありません。</p>
	 * @param args
	 */
	public static void main(String[] args) {
		
		// 引数argsの中身を出力して改行する
		Arrays.stream(args).forEach(arg->System.out.println(arg));
		
		// Hello Worldを出力して改行しない
		System.out.print("hello World!!!");
	}
}