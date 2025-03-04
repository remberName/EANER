package a_2_5.thread;

import a_2_5.datasource.DataSource;

/**
 * [概要] <p>二つスレッド交互クラス。</p>
 * [説明] <p>二つスレッド交互クラス。</p>
 * [補充] <p>特になし。</p>
 */
public class TwoThread {

	/**
	 * 同期用のロックオブジェクト
	 */
	private static final Object lock = new Object();
	
	/**
	 * volatile キーワードは、変数の値をキャッシュせず、常にメインメモリから直接読み書きすることを保証する。
	 * これにより、複数のスレッドがその変数にアクセスした場合でも、最新の値を常に使用することができる。
	 * volatile は、スレッド間で共有する単一の変数に対して効果的である。
	 */
	private volatile int sum = 0;
	
	/**
	 * [概要] <p>リストの要素更新。</p>
	 * [説明] <p>リストの要素は１をプラス。</p>
	 * [補充] <p>特になし。</p>
	 */
	public int runTwoThread() {
		
		// スレッド1
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {

				synchronized (lock) {
					for (int i = 0; i < DataSource.getThreadInteractionList().size(); i++) {
						int num = DataSource.getThreadInteractionList().get(i);
						if (num % 2 != 0) {
							System.out.println(num + "は奇数");
							System.out.println("sumの値："+sum);
							sum += num; 
							
							// スレッド2を通知
							lock.notify();

							// 最後の要素ではない場合はスレッド待ち
							if (i == DataSource.getThreadInteractionList().size() - 1) {
								try {
									lock.wait();
								} catch (InterruptedException e) {
									System.out.println("InterruptedException異常発生しました。");
								}
							}
						}
					}
				}
			}
		});

		// スレッド2
		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {

				// スレッドをブロックする
				synchronized (lock) {
					for (int i = 0; i < DataSource.getThreadInteractionList().size(); i++) {
						int num = DataSource.getThreadInteractionList().get(i);
						if (num % 2 == 0) {
							System.out.println(num + "は偶数");
							System.out.println("sumの値："+sum);
							sum += num; 
							
							// スレッド1に通知
							lock.notify();

							// 最後の要素ではない場合はスレッド待ち
							if (i == DataSource.getThreadInteractionList().size() - 1) {
								try {
									lock.wait();
								} catch (InterruptedException e) {
									System.out.println("InterruptedException異常発生しました。");
								}
							}
						}
					}
				}
			}
		});

		// スレッド起動
		thread1.start();
		thread2.start();
		
		return sum;
	}
}