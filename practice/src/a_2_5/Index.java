package a_2_5;

import java.util.concurrent.ExecutionException;

import a_2_5.thread.ThreadPoolPractise;
import a_2_5.thread.TowThread;

/**
 * [概要] <p>入口クラス。</p>
 * [説明] <p>入口クラス。</p>
 * [補充] <p>特になし。</p>
 */
public class Index {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub

		// 二つスレッド交互クラス
		TowThread towThread = new TowThread();

		towThread.towThread();

		// スレッドプール練習クラス
		ThreadPoolPractise poolPractise = new ThreadPoolPractise();
		// 非同期実行
		poolPractise.threadPoolPractiseAsynchronous();

		// 同期実行
		poolPractise.threadPoolPractiseBlocking();
	}

}
