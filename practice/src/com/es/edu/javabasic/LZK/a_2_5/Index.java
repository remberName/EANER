package com.es.edu.javabasic.LZK.a_2_5;

import com.es.edu.javabasic.LZK.a_2_5.thread.ThreadPoolPractice;
import com.es.edu.javabasic.LZK.a_2_5.thread.TwoThread;

/**
 * [概要] <p>入口クラス。</p>
 * [説明] <p>入口クラス。</p>
 * [補充] <p>特になし。</p>
 */
public class Index {

	public static void main(String[] args) {

		// 二つスレッド交互クラス
		TwoThread twoThread = new TwoThread();

		twoThread.runTwoThread();

		// スレッドプール練習クラス
		ThreadPoolPractice poolPractice = new ThreadPoolPractice();
		// 非同期実行
		poolPractice.threadPoolPracticeAsynchronous();

		// 同期実行
		poolPractice.threadPoolPractiseBlocking();
	}

}
