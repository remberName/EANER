package com.es.edu.javabasic.LZK.a_3_2.java8;

import java.util.List;
import java.util.stream.Collectors;

import com.es.edu.javabasic.LZK.a_3_2.datasources.DataSources;

/**
 * [概要] <p>StreamApi演習クラス。</p>
 * [説明] <p>StreamApi演習クラス。</p>
 * [補充] <p>Stream API では、次の3つの主要な操作が中心となる：</p>
 *		  <p>1.	ソースの生成（Source）: ストリームは、コレクション、配列、I/O チャネルなどから生成される。</p>
 *		  <p>2.	中間操作（Intermediate operations）: ストリームを変換したりフィルタリングしたりする操作。例えば、map() や filter() など。これらは遅延評価される（実際に結果を求めるまで処理が実行されない）ため、効率的である。</p>
 *		  <p>3.	終端操作（Terminal operations）: ストリームの処理を最終的に完了する操作。例えば、forEach() や collect() など。これを呼ぶことで、ストリームの処理が実行される。</p>
 */
public class StreamApiExample {
	
	/**
	 * [概要] <p>stream基本的な例メソッド。</p>
	 * [説明] <p>stream基本的な例メソッド。</p>
	 * [補充] <p>特になし。</p>
	 *
	 */
	public void streamApiExample() {
		
		// 開始時間
		long startTime = System.nanoTime();
		List<Integer> result = DataSources.getNumberList().stream() // ソースの生成
				.filter(n -> n % 2 == 0) // 偶数フィルタ
				.distinct() // 重複データを取り除く
				.map(n -> n * n) // 平方に変換
				.filter(n -> n > 0) // 0ではない
				.collect(Collectors.toList()); // 結果を収集
		// 終了時間
		long endTime = System.nanoTime();
		
		// 実行時間
		long runDuration = endTime - startTime;
		System.out.println("実行時間：" + runDuration+"、処理行数："+result.size());
	}
	
	/**
	 * [概要] <p>stream並列処理メソッド。</p>
	 * [説明] <p>paralleｌStream使って並列処理メソッド。</p>
	 * [補充] <p>特になし。</p>
	 *
	 */
	public void paralletlStreamExample() {
		
		// 開始時間
		long startTime = System.nanoTime();
		List<Integer> result = DataSources.getNumberList().parallelStream() // ソースの生成
				.filter(n -> n % 2 == 0) // 偶数フィルタ
				.distinct() // 重複データを取り除く
				.map(n -> n * n) // 平方に変換
				.filter(n -> n > 0) // 0ではない
				.collect(Collectors.toList()); // 結果を収集
		// 終了時間
		long endTime = System.nanoTime();

		// 実行時間
		long runDuration = endTime - startTime;
		System.out.println("実行時間：" + runDuration+"、処理行数："+result.size());
	}
	
	/**
	 * [概要] <p>合計を計算メソッド。</p>
	 * [説明] <p>reduce()を使って合計を計算メソッド。</p>
	 * [補充] <p>特になし。</p>
	 *
	 */
	public void reduceExample() {
		int sum = DataSources.getNumberList().stream().reduce(0, (a, b) -> a + b);
		System.out.println("合計:"+sum);
	}
	
}
