package a_1_7.management;

import java.util.ArrayList;
import java.util.List;

import a_1_7.task.TaskDto;

/**
 * [概要] <p>タスク管理クラス。</p>
 * [説明] <p>タスク情報を管理クラス。</p>
 * [補充] <p>特になし。</p>
 */
public class TaskManagement {

	/**
	 * [概要] <p>タスク削除。</p>
	 * [説明] <p>タスク削除。</p>
	 * [補充] <p>特になし。</p>
	 *
	 * @param taskId タスクId
	 */
	public static void deleteTask(int taskId) {

		if (DataSource.taskInfo.get(taskId) != null) {
			// Idによって、タスクを削除
			DataSource.taskInfo.remove(taskId);
		} else {
			System.out.println("タスク存在しません");
		}

	}
	
	/**
	 * [概要] <p>タスク更新。</p>
	 * [説明] <p>タスク更新。</p>
	 * [補充] <p>特になし。</p>
	 *
	 * @param taskId タスクId
	 * @param taskDto　タスクDTO
	 * @param userName　実施者名前
	 */
	public static void updateTask(int taskId, TaskDto taskDto, String userName) {

		if (DataSource.taskInfo.get(taskId) != null) {
			// ユーザー名によって、ユーザーIdを取る
			taskDto.setUserId(UserManagement.getUserId(userName));

			// Idによって、タスクを更新
			DataSource.taskInfo.put(taskId, taskDto);
		} else {
			System.out.println("タスク存在しません");
		}

	}
	
	/**
	 * [概要] <p>タスク情報整理。</p>
	 * [説明] <p>タスク情報整理。</p>
	 * [補充] <p>特になし。</p>
	 *
	 * @return タスク情報マップ
	 */
	private static List<String[]> showTask() {

		List<String[]> list = new ArrayList<>();
		// 戻すデータ整理する
		for (int index : DataSource.taskInfo.keySet()) {
			TaskDto taskDto = DataSource.taskInfo.get(index);
			
			String[] s = { String.valueOf(index), // index
					UserManagement.getUserName(taskDto.getUserId()), // ユーザー名
					taskDto.getTaskName(), // 任務名
					taskDto.getTaskStuts(), // 任務状態
					taskDto.getStartTime().toString(), // 開始時間
					taskDto.getEstimatedEndTime().toString(), // 予測終了時間
					taskDto.getEndTime().toString() // 実際終了時間
			};

			list.add(s);
		}

		return list;
	}
	
	/**
	 * [概要] <p>タスク追加。</p>
	 * [説明] <p>タスク追加。</p>
	 * [補充] <p>特になし。</p>
	 *
	 * @param taskDto　タスクDTO
	 */
	public static void addTask(TaskDto taskDto, String userName) {

		if (UserManagement.getUserId(userName) != -1) {
			// ユーザー名によって、ユーザーIdを取る
			taskDto.setUserId(UserManagement.getUserId(userName));

			// Idを取る
			int index = DataSource.taskInfo.size();
			// タスクを追加する
			DataSource.taskInfo.put(index, taskDto);
		} else {
			System.out.println("ユーザー存在しません");
		}

	}

	/**
	 * [概要] <p>タスク出力。</p>
	 * [説明] <p>タスクデータ出力。</p>
	 * [補充] <p>特になし。</p>
	 *
	 */
	public static void taskToString() {
		
		//　整理したリストを取る
		List<String[]> taskList = showTask();
		// 出力
		for (String[] task : taskList) {
			System.out.println("Id:" + task[0] + " ユーザー名:" + task[1] + " 任務名:" + task[2] + " 任務状態:" + task[3] + " 開始時間:"
					+ task[4] + " 予測終了時間:" + task[5] + " 終了時間:" + task[6]);
		}
	}
	
}
