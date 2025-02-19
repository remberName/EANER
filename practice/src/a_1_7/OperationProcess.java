package a_1_7;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import a_1_7.dto.LoginDto;
import a_1_7.dto.TaskDto;
import a_1_7.dto.UserDto;
import a_1_7.management.TaskManagement;
import a_1_7.management.UserManagement;

/**
 * [概要] <p>操作クラス。</p>
 * [説明] <p>操作流れクラス。</p>
 * [補充] <p>特になし。</p>
 */
public class OperationProcess {
	
	/**
	 * [概要] <p>管理者操作流れ。</p>
	 * [説明] <p>管理者操作流れ。</p>
	 * [補充] <p>特になし。</p>
	 *
	 * @param scaner　入力Scanner
	 * @param loginDto　ユーザーログイン情報DTO
	 */
	public void isManager(Scanner scaner, LoginDto loginDto) {
		do {
			// 管理者の場合
			System.out.println("よこそう、" + loginDto.getNickName() + "管理者。");
			System.out.println("""
					1.ユーザー追加
					2.ユーザー削除
					3.ユーザー更新
					4.ユーザー展示
					5.タスク追加
					6.タスク削除
					7.タスク更新
					8.タスク展示
					9.プログラム終了
					数字を選んでください""");
			try {
				// 入力した内容を数字に変換する
				int number = Integer.parseInt(scaner.next());

				switch (number) {

				// ユーザー追加
				case 1:
					UserDto userDto = new UserDto();

					System.out.print("ユーザー名:");
					userDto.setUserName(scaner.next());

					System.out.print("年齢:");
					userDto.setUserAge(scaner.nextInt());

					System.out.print("性別:");
					userDto.setUserSex(scaner.next());

					System.out.print("アドレス:");
					userDto.setUserAddress(scaner.next());

					UserManagement.addUser(userDto);
					// user展示
					UserManagement.userToString();
					break;

				// ユーザー削除
				case 2:
					System.out.print("削除したいユーザー番号:");
					int deleteId = scaner.nextInt();

					UserManagement.deleteUser(deleteId);
					// user展示
					UserManagement.userToString();
					break;

				// ユーザー更新
				case 3:
					UserDto updateUserDto = new UserDto();

					System.out.print("更新したいユーザー番号:");
					updateUserDto.setUserId(scaner.nextInt());

					System.out.print("ユーザー名:");
					updateUserDto.setUserName(scaner.next());

					System.out.print("年齢:");
					updateUserDto.setUserAge(scaner.nextInt());

					System.out.print("性別:");
					updateUserDto.setUserSex(scaner.next());

					System.out.print("アドレス:");
					updateUserDto.setUserAddress(scaner.next());

					UserManagement.updateUser(updateUserDto);
					// user展示
					UserManagement.userToString();
					break;

				// ユーザー展示
				case 4:
					UserManagement.userToString();
					break;

				// タスク追加
				case 5:
					TaskDto taskDto = new TaskDto();

					System.out.print("任務名:");
					taskDto.setTaskName(scaner.next());

					System.out.print("任務状態(1.未開始　2.作成中　3.完了　4.延期):");
					taskDto.setTaskStuts(scaner.nextInt());

					System.out.print("開始時間(ｙｙｙｙ-MM-dd):");
					String startTime = scaner.next();
					taskDto.setStartTime(LocalDate.parse(startTime));

					System.out.print("予測終了時間(ｙｙｙｙ-MM-dd):");
					String estimatedEndTime = scaner.next();
					taskDto.setEstimatedEndTime(LocalDate.parse(estimatedEndTime));

					System.out.print("終了時間(ｙｙｙｙ-MM-dd):");
					String endTime = scaner.next();
					taskDto.setEndTime(LocalDate.parse(endTime));

					System.out.print("実施者名前:");
					String userName = scaner.next();

					TaskManagement.addTask(taskDto, userName);
					// タスク展示
					TaskManagement.taskToString();
					break;

				// タスク削除
				case 6:
					System.out.print("削除したいタスク番号:");
					int taskId = scaner.nextInt();

					TaskManagement.deleteTask(taskId);
					// タスク展示
					TaskManagement.taskToString();
					break;

				// タスク更新
				case 7:
					TaskDto updateTaskDto = new TaskDto();

					System.out.print("更新したいタスク番号:");
					int updateTaskId = scaner.nextInt();

					System.out.print("任務名:");
					updateTaskDto.setTaskName(scaner.next());

					System.out.print("任務状態(1.未開始　2.作成中　3.完了　4.延期):");
					updateTaskDto.setTaskStuts(scaner.nextInt());

					System.out.print("開始時間(ｙｙｙｙ-MM-dd):");
					String updateStartTime = scaner.next();
					updateTaskDto.setStartTime(LocalDate.parse(updateStartTime));

					System.out.print("予測終了時間(ｙｙｙｙ-MM-dd):");
					String updateEstimatedEndTime = scaner.next();
					updateTaskDto.setEstimatedEndTime(LocalDate.parse(updateEstimatedEndTime));

					System.out.print("終了時間(ｙｙｙｙ-MM-dd):");
					String updateEndTime = scaner.next();
					updateTaskDto.setEndTime(LocalDate.parse(updateEndTime));

					System.out.print("実施者名前:");
					String updateUserName = scaner.next();

					TaskManagement.updateTask(updateTaskId, updateTaskDto, updateUserName);
					// タスク展示
					TaskManagement.taskToString();
					break;

				// タスク展示
				case 8:
					TaskManagement.taskToString();
					break;

				// プログラム終了
				case 9:
					System.exit(0);
				}

				// 異常処理
			} catch (NumberFormatException e) {
				System.err.println("1-9の数字を入力してください");
			} catch (DateTimeParseException e) {
				System.err.println("入力時間を確認してください");
			}
		} while (true);
	}
	
	/**
	 * [概要] <p>ユーザー操作流れ。</p>
	 * [説明] <p>ユーザー操作流れ。</p>
	 * [補充] <p>特になし。</p>
	 *
	 * @param scaner　入力Scaner
	 * @param loginDto　ユーザーログイン情報DTO
	 */
	public void isUser(Scanner scaner, LoginDto loginDto) {

		do {
			// ユーザーの場合
			System.out.println("よこそう、" + loginDto.getNickName() + "さん。");
			System.out.println("""
					1.ユーザー展示
					2.タスク展示
					3.プログラム終了
					数字を選んでください""");
			try {
				// 入力した内容を数字に変換する
				int number = Integer.parseInt(scaner.next());

				switch (number) {

				// ユーザー展示
				case 1:
					// user展示
					UserManagement.userToString();
					break;

				// タスク展示
				case 2:
					// タスク展示
					TaskManagement.taskToString();
					break;

				// プログラム終了
				case 3:
					System.exit(0);
				}

				// 異常処理
			} catch (Exception e) {
				System.err.println("1-3の数字を入力してください");
			}
		} while (true);
	}
	
}
