package com.es.edu.javabasic.LZK.a_3_2.java11;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.net.http.WebSocket;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.CountDownLatch;

/**
 * [概要] <p>HttpAPI演習クラス。</p>
 * [説明] <p>HttpAPI演習クラス。</p>
 * [補充] <p>特になし。</p>
 */
public class HttpApiExample {

	/**
	 * [概要] <p>同期リクエスト送信メッソド。</p>
	 * [説明] <p>同期リクエスト送信メッソド。</p>
	 * [補充] <p>特になし。</p>
	 *
	 */
	public void httpClientExample() {
		
		try {
			// HttpClientのインスタンス作成
			HttpClient client = HttpClient.newHttpClient();

			// Http Get リクエスト作成
			HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://jsonplaceholer.typicode.com/posts"))
					.build();

			// リクエストを送信し、レスポンスを取得
			HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

			// レスポンスのステータスコードとボディを表示
			System.out.println("Status Code:" + response.statusCode());
			System.out.println("Response Body:" + response.body());
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * [概要] <p>非同リクエスト期送信メソッド。</p>
	 * [説明] <p>非同リクエスト期送信メソッド。</p>
	 * [補充] <p>特になし。</p>
	 *
	 */
	public void httpClientAsyncExample() {

		// HttpClientのインスタンス作成
		HttpClient client = HttpClient.newHttpClient();

		// HttpClientのインスタンス作成
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://jsonplaceholer.typicode.com/posts"))
				.build();

		// 非同期リクエスト送信
		CompletableFuture<HttpResponse<String>> responseFuture = client.sendAsync(request,
				HttpResponse.BodyHandlers.ofString());

		// 非同リクエストが完了したらレスポンスを処理
		responseFuture.thenAccept(response -> {
			System.out.println("Status Code:" + response.statusCode());
			System.out.println("Response Body:" + response.body());
		}).join(); // メインスレッドをブロックしてレスポンスを待機
	}
	
	/**
	 * [概要] <p>POSTリクエストメソッド。</p>
	 * [説明] <p>POSTリクエストメソッド。</p>
	 * [補充] <p>特になし。</p>
	 *
	 */
	public void httpPostExample() {

		try {
			// HttpClient のインスタンス作成
			HttpClient client = HttpClient.newHttpClient();

			// Http Post リクエストを作成（Json データを送信）
			String json = "{\"title\":\"foo\",\"body\":\"bar\",\"userId\":1}";
			HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://jsonp;aceholder.typicode.com/posts"))
					.header("Content-Type", "application/json").POST(BodyPublishers.ofString(json)).build();

			// リクエストを送信、レスポンスを取得
			HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

			// レスポンスのステータスコードとボディを表示
			System.out.println("Status Code:" + response.statusCode());
			System.out.println("Response Body:" + response.body());
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * [概要] <p>WebSocketメソッド。</p>
	 * [説明] <p>WebSocketメソッド。</p>
	 * [補充] <p>特になし。</p>
	 *
	 */
	public void webSocketExample() {
		
		try {
			// サーバーのWebSocket URI
			URI uri = URI.create("ws://example.com/socket");

			// CountDownLatchを使用して非同期処理の完了を待つ
			CountDownLatch latch = new CountDownLatch(1);

			// WebSocketリスナーの作成
			WebSocket.Listener listener = new WebSocket.Listener() {

				@Override
				public void onOpen(WebSocket webSocket) {
					System.out.println("WebSocket 接続が開かれました");
					webSocket.sendText("Hello WebSocket", true);
					WebSocket.Listener.super.onOpen(webSocket);
				}

				@Override
				public CompletionStage onText(WebSocket webSocket, CharSequence data, boolean last) {
					System.out.println("受信したメッセージ: " + data);
					if (last) {
						latch.countDown(); // メッセージ受信後にLatchをカウントダウン
					}
					return WebSocket.Listener.super.onText(webSocket, data, last);
				}

				@Override
				public void onError(WebSocket webSocket, Throwable error) {
					error.printStackTrace();
					WebSocket.Listener.super.onError(webSocket, error);
				}

				@Override
				public CompletionStage onClose(WebSocket webSocket, int statusCode, String reason) {
					System.out.println("WebSocket 接続が閉じられました");
					return WebSocket.Listener.super.onClose(webSocket, statusCode, reason);
				}
			};

			// HttpClient を使って WebSocket を接続
			HttpClient client = HttpClient.newHttpClient();
			WebSocket webSocket = client.newWebSocketBuilder().buildAsync(uri, listener).join(); // 非同期操作を待機

			// メッセージの送信とレスポンスの受信待機
			latch.await();
			webSocket.sendText("Goodbye WebSocket", true);
			webSocket.sendClose(WebSocket.NORMAL_CLOSURE, "Closing connection");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
