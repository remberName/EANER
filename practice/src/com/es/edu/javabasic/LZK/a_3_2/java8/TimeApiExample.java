package com.es.edu.javabasic.LZK.a_3_2.java8;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * [概要] <p>新しいtimeAPI演習クラス。</p>
 * [説明] <p>新しいtimeAPI演習クラス。</p>
 * [補充] <p>特になし。</p>
 */
public class TimeApiExample {
	
	/**
	 * [概要] <p>日付クラス演習メソッド。</p>
	 * [説明] <p>日付クラス演習メソッド。</p>
	 * [補充] <p>特になし。</p>
	 *
	 */
	public void localDateExample() {

		// 今日の日付を取得
		LocalDate today = LocalDate.now();
		System.out.println("today is " + today);

		// 特定の日付を取得
		LocalDate birthday = LocalDate.of(1999, 12, 01);
		System.out.println("Birthday is " + birthday);

		// 日付の操作（一週間後）
		LocalDate nextWeek = today.plusWeeks(1);
		System.out.println("the next week " + nextWeek);

		// 日付の操作（昨日の日付）
		LocalDate beforｅDay = today.plusDays(-1); // 正数は日付を加える、負数は減らす
		System.out.println("the yestoday is " + beforｅDay);

		// 日付の操作(日付の比較)
		boolean isBeforｅDay = beforｅDay.isAfter(today); // A.isAfter(B);AはBの未来日であるかの判断、A.isBefore(B)は逆になる
		System.out.println(beforｅDay + " is before day?" + isBeforｅDay);
	}
	
	/**
	 * [概要] <p>時刻クラス演習メソッド。</p>
	 * [説明] <p>時刻クラス演習メソッド。</p>
	 * [補充] <p>特になし。</p>
	 *
	 */
	public void localTimeExample() {
		
		// 今の時刻を取得
		LocalTime nowTime = LocalTime.now();
		System.out.println("the now is " + nowTime);

		// 特定の時刻を取得
		LocalTime meetingTime = LocalTime.of(14, 30);
		System.out.println("meeting time is " + meetingTime);

		// 時刻の操作（一時間後）
		LocalTime laterOneHour = nowTime.plusHours(1); // 正数は時間が加える、負数は減らす
		System.out.println("one hour later is " + laterOneHour);

		// 時刻の操作（時刻の比較）
		boolean isBeforeTime = laterOneHour.isBefore(nowTime); // A.isAfter(B);AはBの未来時間であるかの判断、A.isBefore(B)は逆になる
		System.out.println(laterOneHour + "is before time?" + isBeforeTime);
	}
	
	/**
	 * [概要] <p>日時クラス演習メソッド。</p>
	 * [説明] <p>日時クラス演習メソッド。</p>
	 * [補充] <p>特になし。</p>
	 *
	 */
	public void localDateTimeExample() {
		
		// 今の日時を取得
		LocalDateTime now = LocalDateTime.now();
		System.out.println("Current DateTime is " + now);

		// 特定の日時を取得
		LocalDateTime event = LocalDateTime.of(1999, 3, 12, 8, 3);
		System.out.println("event DateTime is " + event);

		// 日時の操作（一か月後）
		LocalDateTime nextMonth = now.plusMonths(1); // 正数は時間が加える、負数は減らす
		System.out.println("the next month is " + nextMonth);

		// 日時の操作（日時の比較）
		boolean isAfterDateTime = nextMonth.isAfter(now); // A.isAfter(B);AはBの未来日時であるかの判断、A.isBefore(B)は逆になる
		System.out.println(nextMonth + " is after time?" + isAfterDateTime);
	}
	
	/**
	 * [概要] <p>タイムゾーンクラス演習メソッド。</p>
	 * [説明] <p>タイムゾーンクラス演習メソッド。</p>
	 * [補充] <p>特になし。</p>
	 *
	 */
	public void zonedDateTimeExample() {

		// 今の日時をタイムゾーン付きで取得
		ZonedDateTime now = ZonedDateTime.now();
		System.out.println("Current DateTime is " + now);

		// 特定のタイムゾーンを指定して日時を取得
		ZonedDateTime tokyoTime = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
		System.out.println("tokyo time is " + tokyoTime);

		// 日時の操作（一か月後）
		ZonedDateTime nextMonth = now.plusMonths(1); // 正数は時間が加える、負数は減らす
		System.out.println("the next month is " + nextMonth);

		// 日時の操作（日時の比較）
		boolean isAfterDateTime = nextMonth.isAfter(now); // A.isAfter(B);AはBの未来日時であるかの判断、A.isBefore(B)は逆になる
		System.out.println(nextMonth + " is after time?" + isAfterDateTime);
	}
	
	/**
	 * [概要] <p>瞬間クラス演習メソッド。</p>
	 * [説明] <p>瞬間クラス演習メソッド。</p>
	 * [補充] <p>特になし。</p>
	 *
	 */
	public void instantExample() {
		
		// 現在の瞬間を取得
		Instant now = Instant.now();
		System.err.println("Current Instant is "+ now);
		
		// 一時間後の瞬間を取得
		Instant oneHourLater = now.plusSeconds(3600); // 3600秒後
		System.out.println("one hour later is "+ oneHourLater);
		
		// タイムゾーンを変換する
		ZonedDateTime zonedDateTime = now.atZone(ZoneId.of("Asia/Tokyo"));
		System.out.println("when the instant time "+now + " change to tokyo time is "+zonedDateTime);
	}
}
