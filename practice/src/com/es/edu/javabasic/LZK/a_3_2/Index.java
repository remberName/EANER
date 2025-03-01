package com.es.edu.javabasic.LZK.a_3_2;

import com.es.edu.javabasic.LZK.a_3_2.java11.HttpApiExample;
import com.es.edu.javabasic.LZK.a_3_2.java11.RandomImageExample;
import com.es.edu.javabasic.LZK.a_3_2.java17.InstanceofExample;
import com.es.edu.javabasic.LZK.a_3_2.java17.SwitchExample;
import com.es.edu.javabasic.LZK.a_3_2.java17.sealedclasses.Bike;
import com.es.edu.javabasic.LZK.a_3_2.java17.sealedclasses.Bus;
import com.es.edu.javabasic.LZK.a_3_2.java17.sealedclasses.Car;
import com.es.edu.javabasic.LZK.a_3_2.java17.sealedclasses.Vehicle;
import com.es.edu.javabasic.LZK.a_3_2.java21.VirtualThreadsExample;
import com.es.edu.javabasic.LZK.a_3_2.java21.sealedinterface.VehicleImp;
import com.es.edu.javabasic.LZK.a_3_2.java8.DefaultMethodExample;
import com.es.edu.javabasic.LZK.a_3_2.java8.LambdaExpressions;
import com.es.edu.javabasic.LZK.a_3_2.java8.OptionalExample;
import com.es.edu.javabasic.LZK.a_3_2.java8.StreamApiExample;
import com.es.edu.javabasic.LZK.a_3_2.java8.TimeApiExample;

/**
 * [概要] <p>入口クラス。</p>
 * [説明] <p>入口クラス。</p>
 * [補充] <p>特になし。</p>
 */
public class Index {

	public static void main(String[] args) {

		// Java 8
		// ラムダ式
		LambdaExpressions lambdaExpressions = new LambdaExpressions();
		// ラムダ基本式メソッド
		lambdaExpressions.LambdaExample();
		// 引数なしラムダ式メソッド
		lambdaExpressions.noArgsLambdaExample();
		// 複数引数ラムダ式メソッド
		lambdaExpressions.MultipleArgsLambdaExample();

		// 新しいtimeAPI
		TimeApiExample timeApiExample = new TimeApiExample();
		// 日付クラス演習メソッド
		timeApiExample.localDateExample();
		// 時刻クラス演習メソッド
		timeApiExample.localTimeExample();
		// 日時クラス演習メソッド
		timeApiExample.localDateTimeExample();
		// タイムゾーンクラス演習メソッド
		timeApiExample.zonedDateTimeExample();
		// 瞬間クラス演習メソッド
		timeApiExample.instantExample();

		// Optional演習クラス
		OptionalExample optionalExample = new OptionalExample();
		// Optionalクラスのメソッド演習
		optionalExample.optionalExample();

		// StreamApi演習クラス
		StreamApiExample streamApiExample = new StreamApiExample();
		// stream基本的な例メソッド
		streamApiExample.streamApiExample();
		// stream並列処理メソッド
		streamApiExample.paralletlStreamExample();
		// 合計を計算メソッド
		streamApiExample.reduceExample();

		// デフォルトメソッド演習クラス
		DefaultMethodExample defaultMethodExample = new DefaultMethodExample();
		// デフォルトメソッド演習インターフェースの抽象メソッド実装
		defaultMethodExample.abstractMethod();
		// デフォルトメソッドをオーバーライドする
		defaultMethodExample.defaultMethod();

		// java 11
		// ランダムのイメージ作成演習クラス
		RandomImageExample randomImageExample = new RandomImageExample();
		// ランダムイメージ作成メソッド
		randomImageExample.runPaintComponent();
		// 画像の出力
		randomImageExample.saveImageExample();

		// HttpAPI演習クラス (実行できない)
		HttpApiExample httpApiExample = new HttpApiExample();
		// 同期リクエスト送信メッソド
		// httpApiExample.httpClientExample();
		// 非同リクエスト期送信メソッド
		// httpApiExample.httpClientAsyncExample();
		// POSTリクエストメソッド
		// httpApiExample.httpPostExample();

		// java 17
		// switch演習クラス
		SwitchExample switchExample = new SwitchExample();
		// switch演習メソッド
		switchExample.switchExample();

		// instanceof演習クラス
		InstanceofExample instanceofExample = new InstanceofExample();
		// instanceof演習メソッド
		instanceofExample.instanceofExample();

		// シールクラス演習
		// Carクラス
		Car car = new Car();
		car.run();
		car.sped();
		// バスクラス
		Bus bus = new Bus();
		bus.run();
		bus.sped();
		// バイククラス
		Bike bike = new Bike();
		bike.run();
		// 車クラス
		Vehicle vehicle = new Vehicle();
		vehicle.run();

		// Java 21
		// シールインターフェース
		VehicleImp carImp = new com.es.edu.javabasic.LZK.a_3_2.java21.sealedinterface.Car();
		carImp.run();
		VehicleImp bikeImp = new com.es.edu.javabasic.LZK.a_3_2.java21.sealedinterface.Bike();
		bikeImp.run();
		com.es.edu.javabasic.LZK.a_3_2.java21.sealedinterface.Bus busImpl = new com.es.edu.javabasic.LZK.a_3_2.java21.sealedinterface.Bus();
		busImpl.run();
		busImpl.sped();

		// 仮想スレッドクラス
		VirtualThreadsExample virtualThreadsExample = new VirtualThreadsExample();
		// 仮想スレッドメソッド
		virtualThreadsExample.virtualThreadExample();
		// 仮想スレッドメソッド、別の書き方
		virtualThreadsExample.virtualThreadExample1();
		// 仮想スレッドプールメソッド
		virtualThreadsExample.virtualThreadPoolExample();
		// 仮想スレッドプールメソッド、別の書き方
		virtualThreadsExample.virtualThreadPoolExample2();
	}

}
