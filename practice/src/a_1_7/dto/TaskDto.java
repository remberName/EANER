package a_1_7.dto;

import java.time.LocalDate;

/**
 * [概要] <p>タスクDTOクラス。</p>
 * [説明] <p>タスクDTO。</p>
 * [補充] <p>特になし。</p>
 */
public class TaskDto {

	/**
	 * ユーザーID
	 */
	private int userId;
	
	/**
	 * 任務名前
	 */
	private String taskName;
	
	/**
	 * 任務状態
	 */
	private int taskStuts;
	
	/**
	 * 任務開始時間
	 */
	private LocalDate startTime;
	
	/**
	 * 任務終了予測時間
	 */
	private LocalDate estimatedEndTime;
	
	/**
	 * 任務終了実際時間
	 */
	private LocalDate endTime;
	
	public TaskDto() {
		super();
	}

	public TaskDto(int userId, String taskName, int taskStuts, LocalDate startTime, LocalDate estimatedEndTime,
			LocalDate endTime) {
		super();
		this.userId = userId;
		this.taskName = taskName;
		this.taskStuts = taskStuts;
		this.startTime = startTime;
		this.estimatedEndTime = estimatedEndTime;
		this.endTime = endTime;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getTaskStuts() {
		if (taskStuts == 1) {
			return "未開始";
		} else if (taskStuts == 2) {
			return "作成中";
		} else if (taskStuts == 3) {
			return "完了";
		} else {
			return "延期";
		}
	}

	public void setTaskStuts(int taskStuts) {
		this.taskStuts = taskStuts;
	}

	public LocalDate getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalDate startTime) {
		this.startTime = startTime;
	}

	public LocalDate getEstimatedEndTime() {
		return estimatedEndTime;
	}

	public void setEstimatedEndTime(LocalDate estimatedEndTime) {
		this.estimatedEndTime = estimatedEndTime;
	}

	public LocalDate getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalDate endTime) {
		this.endTime = endTime;
	}
	
}
