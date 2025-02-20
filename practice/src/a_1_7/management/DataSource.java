package a_1_7.management;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import a_1_7.dto.LoginDto;
import a_1_7.dto.TaskDto;
import a_1_7.dto.UserDto;
/**
 * [概要] <p>データクラス。</p>
 * [説明] <p>データの作成と初期化。</p>
 * [補充] <p>特になし。</p>
 */
public class DataSource {
	
	/**
	 * ユーザー情報
	 * Map<ユーザーID,ユーザー情報DTO>
	 */
	private final static Map<Integer, UserDto> userInfo = new HashMap<Integer, UserDto>();
	
	/**
	 * ログイン情報
	 * Map<ユーザーId,ログインDTO>
	 */
	private final static Map<Integer,LoginDto> loginInfo = new HashMap<Integer,LoginDto>();
	
	/**
	 * 任務情報マップ
	 * Map<ユーザーId,任務DTO>
	 */
	private final static Map<Integer,TaskDto> taskInfo = new HashMap<Integer,TaskDto>();

	/**
	 * [概要] <p>初期化。</p>
	 * [説明] <p>ユーザー情報初期化。</p>
	 * [補充] <p>。</p>
	 *
	 */
	private static void userInfoInit() {
		userInfo.put(0, new UserDto(0, "admin", 20, "男", "東京"));
		userInfo.put(1, new UserDto(1, "yamato", 20, "女", "埼玉"));
		userInfo.put(2, new UserDto(2, "saitou", 20, "男", "千葉"));
		userInfo.put(3, new UserDto(3, "tanaka", 20, "女", "神奈川"));
	}
	
	/**
	 * [概要] <p>初期化。</p>
	 * [説明] <p>任務情報マップ初期化。</p>
	 * [補充] <p>特になし。</p>
	 *
	 */
	private static void taskInfoInit() {
		taskInfo.put(0, new TaskDto(1, "数学", 2, LocalDate.of(2025, 2, 12), LocalDate.of(2025, 2, 13), LocalDate.of(2025, 2, 15)));
		taskInfo.put(1, new TaskDto(1, "国語", 2, LocalDate.of(2025, 2, 13), LocalDate.of(2025, 2, 13), LocalDate.of(2025, 2, 15)));
		taskInfo.put(2, new TaskDto(1, "科学", 3, LocalDate.of(2025, 2, 14), LocalDate.of(2025, 2, 13), LocalDate.of(2025, 2, 15)));
		taskInfo.put(3, new TaskDto(2, "物理", 2, LocalDate.of(2025, 2, 13), LocalDate.of(2025, 2, 13), LocalDate.of(2025, 2, 15)));
		taskInfo.put(4, new TaskDto(2, "体育", 1, LocalDate.of(2025, 2, 14), LocalDate.of(2025, 2, 13), LocalDate.of(2025, 2, 15)));
		taskInfo.put(5, new TaskDto(2, "歴史", 1, LocalDate.of(2025, 2, 11), LocalDate.of(2025, 2, 13), LocalDate.of(2025, 2, 15)));
		taskInfo.put(6, new TaskDto(3, "外国語", 1, LocalDate.of(2025, 2, 12), LocalDate.of(2025, 2, 13), LocalDate.of(2025, 2, 15)));
		taskInfo.put(7, new TaskDto(3, "政治", 1, LocalDate.of(2025, 2, 14), LocalDate.of(2025, 2, 13), LocalDate.of(2025, 2, 15)));
		taskInfo.put(8, new TaskDto(3, "美術", 1, LocalDate.of(2025, 2, 13), LocalDate.of(2025, 2, 13), LocalDate.of(2025, 2, 15)));
		taskInfo.put(9, new TaskDto(1, "数学", 1, LocalDate.of(2025, 2, 12), LocalDate.of(2025, 2, 13), LocalDate.of(2025, 2, 15)));
	}
	
	/**
	 * [概要] <p>初期化。</p>
	 * [説明] <p>ログイン情報初期化。</p>
	 * [補充] <p>特になし。</p>
	 *
	 */
	private static void loginInfoInit() {
		loginInfo.put(0, new LoginDto(0, "admin", "admin"));
		loginInfo.put(1, new LoginDto(1, "桜", "sakura"));
		loginInfo.put(2, new LoginDto(2, "花", "hana"));
		loginInfo.put(3, new LoginDto(3, "陰陽師", "onmyouji"));
	}
	
	/**
	 * データ初期化
	 */
	static {
		userInfoInit();
		loginInfoInit();
		taskInfoInit();
	}

	public static Map<Integer, UserDto> getUserInfo() {
		return userInfo;
	}

	public static Map<Integer, LoginDto> getLoginInfo() {
		return loginInfo;
	}

	public static Map<Integer, TaskDto> getTaskInfo() {
		return taskInfo;
	}

}
