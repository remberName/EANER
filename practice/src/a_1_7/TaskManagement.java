package a_1_7;

import java.util.ArrayList;
import java.util.List;

/**
 * [概要] <p>タスク管理クラス。</p>
 * [説明] <p>タスク情報を管理クラス。</p>
 * [補充] <p>特になし。</p>
 */
public class TaskManagement {

	/**
	 * ユーザー情報クラス
	 */
	private UserManagement userManagement = new UserManagement();
	
	
	/**
	 * [概要] <p>タスク削除。</p>
	 * [説明] <p>タスク削除。</p>
	 * [補充] <p>特になし。</p>
	 *
	 * @param taskId タスクId
	 */
	public void deleteTask(int taskId) {

		if (DataScoure.taskInfo.get(taskId) != null) {
			// Idによって、タスクを削除
			DataScoure.taskInfo.remove(taskId);
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
	public void updateTask(int taskId, TaskDto taskDto, String userName) {

		if (DataScoure.taskInfo.get(taskId) != null) {
			// ユーザー名によって、ユーザーIdを取る
			taskDto.setUserId(userManagement.getUserId(userName));

			// Idによって、タスクを更新
			DataScoure.taskInfo.put(taskId, taskDto);
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
	private List<String[]> showTask() {

		List<String[]> list = new ArrayList<>();
		// 戻すデータ整理する
		for (int index : DataScoure.taskInfo.keySet()) {
			String[] s = { String.valueOf(index), // index
					userManagement.getUserName(DataScoure.taskInfo.get(index).getUserId()), // ユーザー名
					DataScoure.taskInfo.get(index).getTaskName(), // 任務名
					DataScoure.taskInfo.get(index).getTaskStuts(), // 任務状態
					DataScoure.taskInfo.get(index).getStartTime().toString(), // 開始時間
					DataScoure.taskInfo.get(index).getEstimatedEndTime().toString(), // 予測終了時間
					DataScoure.taskInfo.get(index).getEndTime().toString() // 実際終了時間
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
	public void addTask(TaskDto taskDto, String userName) {

		if (userManagement.getUserId(userName) != -1) {
			// ユーザー名によって、ユーザーIdを取る
			taskDto.setUserId(userManagement.getUserId(userName));

			// Idを取る
			int index = DataScoure.taskInfo.size();
			// タスクを追加する
			DataScoure.taskInfo.put(index, taskDto);
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
	public void taskToString() {
		
		//　整理したリストを取る
		List<String[]> taskList = showTask();
		// 出力
		for (String[] task : taskList) {
			System.out.println("Id:" + task[0] + " ユーザー名:" + task[1] + " 任務名:" + task[2] + " 任務状態:" + task[3] + " 開始時間:"
					+ task[4] + " 予測終了時間:" + task[5] + " 終了時間:" + task[6]);
		}
	}
	
}
