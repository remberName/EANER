package com.es.edu.javabasic.LZK.a_3_2.java11;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * [概要] <p>ランダムのイメージ作成演習クラス。</p>
 * [説明] <p>ランダムのイメージ作成演習クラス。</p>
 * [補充] <p>特になし。</p>
 */
public class RandomImageExample extends JPanel {
	
	// ランダムインスタンス作成
	private Random random = new Random();

	/**
	 * [概要] <p>ランダムイメージ作成メソッド。</p>
	 * [説明] <p>ランダムイメージ作成メソッド。</p>
	 * [補充] <p>特になし。</p>
	 *
	 */
	@Override
	protected void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		// 赤色
		int red = random.nextInt(256);
		// 緑色
		int green = random.nextInt(256);
		// 青色
		int blue = random.nextInt(256);
		
		// RGBカラーを生成
		Color randomColor = new Color(red,green,blue);
		
		// ランダムな図形を描く
		g.setColor(randomColor);
		int x = random.nextInt(getWidth());
		int y = random.nextInt(getHeight());
		int diameter = random.nextInt(100)+20; // 20から119の間でランダムな直径
		
		g.fillOval(x, y, y, diameter);
	}
	
	/**
	 * [概要] <p>ランダムイメージ展示メソッド。</p>
	 * [説明] <p>ランダムイメージ展示メソッド。</p>
	 * [補充] <p>特になし。</p>
	 *
	 */
	public void runPaintComponent() {
		JFrame frame = new JFrame();
		RandomImageExample randomImageExample = new RandomImageExample();
		frame.add(randomImageExample);
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	/**
	 * [概要] <p>画像の出力。</p>
	 * [説明] <p>画像出力メソッド。</p>
	 * [補充] <p>特になし。</p>
	 *
	 */
	public void saveImageExample() {

		// 画像サイズ
		int width = 800;
		int height = 600;

		// 画像生成
		BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		Graphics g = image.getGraphics();

		// ランダムな背景を設定
		g.setColor(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
		g.fillRect(0, 0, width, height);

		// 画像をファイルとして保存
		try {
			ImageIO.write(image, "PNG", new File("random_image.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
