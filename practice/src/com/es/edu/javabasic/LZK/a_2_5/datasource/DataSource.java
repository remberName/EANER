package com.es.edu.javabasic.LZK.a_2_5.datasource;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * [概要] <p>データソースクラス。</p>
 * [説明] <p>データソースクラス。</p>
 * [補充] <p>特になし。</p>
 */
public class DataSource {
	
	/**
	 * 二つスレッド交互データ
	 */
	private static List<Integer> threadInteractionList = new ArrayList<>() {
		{
			add(1);
			add(2);
			add(3);
			add(4);
			add(5);
			add(6);
			add(7);
			add(8);
			add(9);
			add(0);
		}
	};

	/**
	 * スレッドプール練習データ
	 */
	private static int[] threadPoolNumbers = { 10, 12, 15, 16, 1, 85, 7, 552, 8, 5, 9, 556, 4 };
	private static List<Integer> threadPoolList = new ArrayList<>() {
		{
			add(10);
			add(12);
			add(17);
			add(14);
			add(18);
			add(15);
			add(12);
			add(13);
			add(16);
			add(19);
			add(11);
		}
	};
	private static Set<Integer> threadPoolSet = new HashSet<>() {
		{
			add(10);
			add(20);
			add(17);
			add(14);
			add(18);
			add(15);
			add(12);
			add(13);
			add(16);
			add(19);
			add(11);
		}
	};

	public static List<Integer> getThreadInteractionList() {
		return threadInteractionList;
	}

	public static int[] getThreadPoolNumbers() {
		return threadPoolNumbers;
	}

	public static List<Integer> getThreadPoolList() {
		return threadPoolList;
	}

	public static Set<Integer> getThreadPoolSet() {
		return threadPoolSet;
	}
	
}
