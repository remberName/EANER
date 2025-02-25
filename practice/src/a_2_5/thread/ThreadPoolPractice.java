package a_2_5.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import a_2_5.datasource.DataSource;

/**
 * [概要] <p>スレッドプール練習クラス。</p>
 * [説明] <p>スレッドプール練習クラス。</p>
 * [補充] <p>特になし。</p>
 */
public class ThreadPoolPractice{
	
	/**
	 * [概要] <p>スレッドプール非同期実行メソッド。</p>
	 * [説明] <p>スレッドプール非同期実行メソッド。</p>
	 * [補充] <p>特になし。</p>
	 *
	 * @throws InterruptedException
	 * @throws ExecutionException
	 */
	public void threadPoolPracticeAsynchronous(){
		ExecutorService executorService = Executors.newFixedThreadPool(3);

		// スレッド１
		Callable<String> task1 = () -> {
			System.out.println("非同期task1開始");
			for (int i = 0; i < DataSource.getThreadPoolList().size(); i++) {
				DataSource.getThreadPoolList().set(i, i);
			}
			return "非同期task1終了";
		};

		// スレッド２
		Callable<String> task2 = () -> {
			System.out.println("非同期task2開始");
			for (int i = 0; i < DataSource.getThreadPoolNumbers().length; i++) {
				DataSource.getThreadPoolNumbers()[i] = DataSource.getThreadPoolNumbers()[i] * 2;
			}
			return "非同期task2終了";
		};

		// スレッド３ Setで、要素を頻繁に変更は進めないから、sumを求める
		Callable<String> task3 = () -> {
			System.out.println("非同期task3開始");
			int sum = 0;
			for (int num : DataSource.getThreadPoolSet()) {
				sum += num;
			}
			Thread.sleep(6000);
			return "非同期task3終了,sum:" + sum;
		};
		
		// スレッド4 
		Callable<String> task4 = () -> {
			System.out.println("非同期task4開始");
			return "非同期task4終了";
		};

		// スレッド5 
		Callable<String> task5 = () -> {
			System.out.println("非同期task5開始");
			return "非同期task5終了";
		};
		
		// スレッド6
		Callable<String> task6 = () -> {
			System.out.println("非同期task6開始");
			return "非同期task6終了";
		};

		// スレッド7
		Callable<String> task7 = () -> {
			System.out.println("非同期task7開始");
			return "非同期task7終了";
		};

		// スレッド8
		Callable<String> task8 = () -> {
			System.out.println("非同期task8開始");
			return "非同期task8終了";
		};

		// スレッド非同期実行「非同期：順番ではなく、他のスレッド実行終了待ちせず、他のスレッド並列実行」
		Future<String> future1 = executorService.submit(task1);
		Future<String> future2 = executorService.submit(task2);
		Future<String> future3 = executorService.submit(task3);
		Future<String> future4 = executorService.submit(task4);
		Future<String> future5 = executorService.submit(task5);
		Future<String> future6 = executorService.submit(task6);
		Future<String> future7 = executorService.submit(task7);
		Future<String> future8 = executorService.submit(task8);

		// 実行終了出力
		try {
			System.out.println(future1.get());
			System.out.println(future2.get());
			System.out.println(future3.get());
			System.out.println(future4.get());
			System.out.println(future5.get());
			System.out.println(future6.get());
			System.out.println(future7.get());
			System.out.println(future8.get());
		} catch (InterruptedException e) {
			System.out.println("InterruptedException異常発生しました。");
		} catch (ExecutionException e) {
			System.out.println("ExecutionException異常発生しました。");
		}
		

		// プールをシャットダウン
		executorService.shutdown();
	}
	
	/**
	 * [概要] <p>スレッドプール同期実行メソッド。</p>
	 * [説明] <p>スレッドプール同期実行メソッド。</p>
	 * [補充] <p>特になし。</p>
	 *
	 * @throws InterruptedException
	 * @throws ExecutionException
	 */
	public void threadPoolPractiseBlocking() {
		ExecutorService executorService = Executors.newFixedThreadPool(3);

		// スレッド１
		Callable<String> task1 = () -> {
			System.out.println("同期task1開始");
			for (int i = 0; i < DataSource.getThreadPoolList().size(); i++) {
				DataSource.getThreadPoolList().set(i, i);
			}
			return "同期task1終了";
		};

		// スレッド２
		Callable<String> task2 = () -> {
			System.out.println("同期task2開始");
			for (int i = 0; i < DataSource.getThreadPoolNumbers().length; i++) {
				DataSource.getThreadPoolNumbers()[i] = DataSource.getThreadPoolNumbers()[i] * 2;
			}
			return "同期task2終了";
		};

		// スレッド３ Setで、要素を頻繁に変更は進めないから、sumを求める
		Callable<String> task3 = () -> {
			System.out.println("同期task3開始");
			int sum = 0;
			for (int num : DataSource.getThreadPoolSet()) {
				sum += num;
			}
			return "同期task3終了,sum:" + sum;
		};
		Callable<String> task4 = () -> {
			System.out.println("同期task4開始");
			return "同期task4終了";
		};

		// スレッド5 
		Callable<String> task5 = () -> {
			System.out.println("同期task5開始");
			Thread.sleep(3000);
			return "同期task5終了";
		};
		
		// スレッド6
		Callable<String> task6 = () -> {
			System.out.println("同期task6開始");
			return "同期task6終了";
		};

		// スレッド7
		Callable<String> task7 = () -> {
			System.out.println("同期task7開始");
			return "同期task7終了";
		};

		// スレッド8
		Callable<String> task8 = () -> {
			System.out.println("同期task8開始");
			return "同期task8終了";
		};

		List<Callable<String>> list = new ArrayList<Callable<String>>() {
			{
				add(task1);
				add(task2);
				add(task3);
				add(task4);
				add(task5);
				add(task6);
				add(task7);
				add(task8);
			}
		};

		// スレッド同期実行「同期：順番である、他のスレッド実行終了まで待ち」
		
		try {
			List<Future<String>> result = executorService.invokeAll(list);
			result.forEach(future -> {
					try {
						System.out.println(future.get());
					} catch (InterruptedException e) {
						System.out.println("InterruptedException異常発生しました。");
					} catch (ExecutionException e) {
						System.out.println("ExecutionException異常発生しました。");
					}
			});
		} catch (InterruptedException e) {
			System.out.println("InterruptedException異常発生しました。");
		}

		// 実行終了出力
		

		// プールをシャットダウン
		executorService.shutdown();
	}
}
