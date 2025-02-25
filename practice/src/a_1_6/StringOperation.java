package a_1_6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * [概要] <p>文字列操作クラス。</p>
 * [説明] <p>文字列操作クラス。</p>
 * [補充] <p>特になし。</p>
 */
public class StringOperation {
	
	/**
	 * [概要] <p>ロジックメソッド。</p>
	 * [説明] <p>文字列操作プログラムロジックメソッド。</p>
	 * [補充] <p>特になし。</p>
	 *
	 */
	public void logic() {
		
		// 文字列置換
		System.out.println("\n文字列置換引数：zabcdefghizjklmnopqrzstuvwxyz,z,-");
		replaceString("zabcdefghizjklmnopqrzstuvwxyz", "z", "-");
		
		// 文字列分割
		System.out.println("\n文字列分割引数：zabcdefghizjklmnopqrzstuvwxyz,z");
		splitString("zabcdefghizjklmnopqrzstuvwxyz", "z");
		
		// 文字列分割
		System.out.println("\n文字列分割引数：a2b2c2d2e1w5,[0-9]");
		splitString("a2b2c2d2e1w5", "[0-9]");
		
		// 文字列連結
		System.out.println("\n文字列連結引数：abc,def,efg");
		joinString("abc", "def", "efg");
	}

	/**
	 * [概要] <p>文字列置換メソッド。</p>
	 * [説明] <p>文字列置換メソッド。</p>
	 * [補充] <p>特になし。</p>
	 *
	 * @param str　元の文字列
	 * @param oldStr　置換されたい文字列
	 * @param newStr　置換したい文字列
	 */
	private void replaceString(String str,String oldStr,String newStr) {
		
		// すべて置換
		System.out.println("すべて置換："+str.replaceAll(oldStr, newStr));
		
		// 最初出る文字置換
		System.out.println("最初出る文字列置換："+str.replaceFirst(oldStr, newStr));
		
		// 単純な置換
		System.out.println("単純な置換："+str.replace(oldStr, newStr));
	}
	
	/**
	 * [概要] <p>文字列分割メソッド。</p>
	 * [説明] <p>文字列分割メソッド。</p>
	 * [補充] <p>特になし。</p>
	 *
	 * @param str 分割される文字列
	 * @param regex　分割の記号
	 */
	private void splitString(String str,String regex) {
		
		// 文字列を分割
		String[] splitStｒ = str.split(regex);
		// 分割された文字列を出力
		System.out.println("分割された文字列：");
		for (String s : splitStｒ) {
			System.out.print(s + "\t");
		}

		// 三つだけ分割
		String[] splitStrOnlyThree = str.split(regex, 3);
		// 分割された文字列を出力
		System.out.println("\n三つの要素だけ分割：");
		for (String s : splitStrOnlyThree) {
			System.out.println(s + "\t");
		}
		
	}
	
	/**
	 * [概要] <p>文字列連結メソッド。</p>
	 * [説明] <p>文字列連結メソッド。</p>
	 * [補充] <p>特になし。</p>
	 *
	 * @param str1 文字列１
	 * @param str2 文字列２
	 * @param str3 文字列３
	 */
	private void joinString(String str1,String str2,String str3) {
		
		// 「+」で連結
		System.out.println(str1+str2+str3);
		
		// concatメソッドで連結
		System.out.println(str1.concat(str2).concat(str3));
		
		// format()で連結
		System.out.println(String.format("%s%s%s", str1, str2, str3));

		// Collectorsで連結
		List<String> list = Arrays.asList(str1, str2, str3);
		String result = list.stream().collect(Collectors.joining(""));
		System.out.println(result);

		// ラムダ式で連結
		StringBuilder builder = new StringBuilder();
		list.forEach(s -> builder.append(s));
		System.out.println(builder.toString());
	}
}
