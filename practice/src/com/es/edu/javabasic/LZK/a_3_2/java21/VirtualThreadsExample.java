package com.es.edu.javabasic.LZK.a_3_2.java21;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * [概要] <p>仮想スレッド演習クラス。</p>
 * [説明] <p>仮想スレッド演習クラス。</p>
 * [補充] <p>特になし。</p>
 */
public class VirtualThreadsExample {

	/**
	 * [概要] <p>仮想スレッド作成メソッド。</p>
	 * [説明] <p>仮想スレッド作成メソッド。</p>
	 * [補充] <p>特になし。</p>
	 *
	 */
	public void virtualThreadExample() {
		// 仮想スレッドを作成して実行
		ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();
		executor.submit(() -> {
			System.out.println("this is a virtual threads");
		});
	}
	
	/**
	 * [概要] <p>仮想スレッド作成メソッド。</p>
	 * [説明] <p>仮想スレッド作成メソッド。</p>
	 * [補充] <p>特になし。</p>
	 *
	 */
	public void virtualThreadExample1() {
		// 仮想スレッドを作成して実行
		Thread virtualThread = Thread.ofVirtual().start(() -> {
			System.out.println("this is a virtual threads");
		});

		try {
			virtualThread.join();
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}
	
	/**
	 * [概要] <p>仮想スレッドプール作成メソッド。</p>
	 * [説明] <p>仮想スレッドプール作成メソッド。</p>
	 * [補充] <p>特になし。</p>
	 *
	 */
	public void virtualThreadPoolExample() {
		Executor executor = Executors.newVirtualThreadPerTaskExecutor();
		
		// 仮想スレッドプールでタスクを実行
		for(int i = 0;i<5;i++) {
			int taskId = i;
			executor.execute(()->{
				System.out.println("task "+ taskId+" is running in a virtual thread");
			});
			
		}
		// 少し待つ
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * [概要] <p>仮想スレッドプール作成メソッド。</p>
	 * [説明] <p>仮想スレッドプール作成メソッド。</p>
	 * [補充] <p>特になし。</p>
	 *
	 */
	public void virtualThreadPoolExample2() {
		
		for(int i = 0;i<5;i++) {
			int taskId = i;
			Thread virtualThread = Thread.ofVirtual().start(()->{
				System.out.println("task "+taskId+" is running in a virtual thread");
			});
			
			try {
				virtualThread.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
