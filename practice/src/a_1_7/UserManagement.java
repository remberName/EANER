package a_1_7;

import java.util.ArrayList;
import java.util.List;

/**
 * [概要] <p>ユーザー管理クラス。</p>
 * [説明] <p>ユーザーの情報を管理クラス。</p>
 * [補充] <p>特になし。</p>
 */
public class UserManagement {
	
	/**
	 * [概要] <p>ユーザー追加。</p>
	 * [説明] <p>ユーザー追加。</p>
	 * [補充] <p>特になし。</p>
	 *
	 * @param userDto 追加されたいユーザ一
	 */
	public void addUser(UserDto userDto) {

		// ユーザーIdを取る
		int userId = DataScoure.userInfo.size();

		if (!checkUser(userDto)) {
			// ユーザー追加
			DataScoure.userInfo.put(userId, userDto);
		} else {
			System.out.println("ユーザー存在しています");
		}

	}
	
	/**
	 * [概要] <p>ユーザー情報整理。</p>
	 * [説明] <p>ユーザー情報整理。</p>
	 * [補充] <p>特になし。</p>
	 *
	 * @return 整理したリスト
	 */
	private List<String[]> showUser() {
		
		List<String[]> list = new ArrayList<>();
		// 戻すデータ整理する
		for (int index : DataScoure.userInfo.keySet()) {
			String[] s = { String.valueOf(index), // index
					DataScoure.userInfo.get(index).getUserName(), // ユーザー名
					DataScoure.userInfo.get(index).getUserSex(), // 性別
					String.valueOf(DataScoure.userInfo.get(index).getUserAge()), // 年齢
					DataScoure.userInfo.get(index).getUserAddress() // アドレス
			};

			list.add(s);
		}
		return list;
	}
	
	/**
	 * [概要] <p>ユーザー出力。</p>
	 * [説明] <p>ユーザーデータ出力。</p>
	 * [補充] <p>特になし。</p>
	 *
	 */
	public void userToString() {

		//　整理したリストを取る
		List<String[]> userList = showUser();
		// 出力
		for (int i = 0; i < userList.size(); i++) {
			System.out.println("Id:" + userList.get(i)[0] + " 名前:" + userList.get(i)[1] + " 性別:" + userList.get(i)[2]
					+ " 年齢:" + userList.get(i)[3] + " アドレス:" + userList.get(i)[4]);
		}
	}
	
	/**
	 * [概要] <p>ユーザー削除。</p>
	 * [説明] <p>ユーザー削除。。</p>
	 * [補充] <p>特になし。</p>
	 *
	 * @param userId 削除したいユーザーId
	 */
	public void deleteUser(int userId) {

		if (getUserName(userId) != null) {
			// マップからユーザー削除
			DataScoure.userInfo.keySet().removeIf(key -> key == userId);
		} else {
			// Id存在しない
			System.out.println("管理者削除できない");
		}

	}
	
	/**
	 * [概要] <p>ユーザー情報更新。</p>
	 * [説明] <p>ユーザー情報更新。</p>
	 * [補充] <p>時になし。</p>
	 *
	 * @param userDto ユーザー情報
	 */
	public void updateUser(UserDto userDto) {
		
		// ユーザーIdを取る
		int userId = userDto.getUserId();

		// ユーザーを更新
		DataScoure.userInfo.put(userId, userDto);

	}
	
	/**
	 * [概要] <p>ユーザー名取る。</p>
	 * [説明] <p>ユーザー名取る。</p>
	 * [補充] <p>特になし。</p>
	 *
	 * @param userId　ユーザーId
	 * @return　ユーザー名
	 */
	public String getUserName(int userId) {
		
		// ユーザーIdによって、ユーザー名を取る
		if (DataScoure.userInfo.get(userId) != null) {
			return DataScoure.userInfo.get(userId).getUserName();
		}

		// 存在しない場合、nullを戻す
		return null;
	}
	
	/**
	 * [概要] <p>ユーザーId取る。</p>
	 * [説明] <p>ユーザーId取る。</p>
	 * [補充] <p>特になし。</p>
	 *
	 * @param userName　ユーザー名
	 * @return　ユーザーId
	 */
	public int getUserId(String userName) {
		
		// ユーザー名によって、ユーザーIdを取る
		for (int index : DataScoure.userInfo.keySet()) {
			if (DataScoure.userInfo.get(index).getUserName().equals(userName)) {
				return index;
			}
		}

		// 存在しない場合は-１を戻す
		return -1;
	}
	
	/**
	 * [概要] <p>ユーザー存在するか判断。</p>
	 * [説明] <p>ユーザー存在するか判断。</p>
	 * [補充] <p>特になし。</p>
	 *
	 * @param userDto　ユーザーDTO
	 * @return　判断結果
	 */
	private boolean checkUser(UserDto userDto) {
		
		// ユーザー存在フラグ
		boolean haveUser = false;

		// ユーザー存在するかどうか判断
		for (int index : DataScoure.userInfo.keySet()) {
			if (DataScoure.userInfo.get(index).getUserName().equals(userDto.getUserName())) {
				// 存在した場合
				haveUser = true;
			}
		}

		return haveUser;
	}
	
}
