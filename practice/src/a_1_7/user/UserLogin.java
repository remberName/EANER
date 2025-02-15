package a_1_7;

import java.util.List;

/**
 * [概要] <p>ログインクラス。</p>
 * [説明] <p>ユーザーログインクラス。</p>
 * [補充] <p>特になし。</p>
 */
public class UserLogin {

	/**
	 * [概要] <p>ユーザーログイン。</p>
	 * [説明] <p>ユーザーログイン。</p>
	 * [補充] <p>特になし。</p>
	 *
	 * @param userName ユーザー名
	 * @param suerPassword ユーザーpsw
	 * @return ログインDTO
	 */
	public LoginDto userLogin(String userName,String suerPassword) {
		
		// ユーザー管理クラスからユーザー情報マップを取って、ループする
		List<UserDto> userDtoList = DataScoure.userInfo.values().stream().toList();
		for (UserDto userDto : userDtoList) {

			// ユーザー名によって、ユーザーIdを探す
			if (userDto.getUserName().equals(userName)) {
				System.out.println(userDto.getUserName());
				// ユーザーIdによって、ログイン情報マップからパスワードを検証する
				if (DataScoure.loginInfo.get(userDto.getUserId()).getPassword().equals(suerPassword)) {

					// 検証通った場合、 ログインDTODTOを戻す
					return DataScoure.loginInfo.get(userDto.getUserId());
				}
			}
		}

		// ログインできない場合はnullを戻す
		return null;
	}
	
	/**
	 * [概要] <p>管理者判断。</p>
	 * [説明] <p>管理者判断。</p>
	 * [補充] <p>特になし。</p>
	 *
	 * @param loginDto　ログイン情報
	 * @return　管理者かどうか結果
	 */
	public boolean isManager(LoginDto loginDto) {
		// ユーザーIdによって、管理者に判断する、ユーザーIdは０の場合は管理者になる、tureを戻す
		return loginDto.getUserId() == 0 ? true : false;
	}


}
