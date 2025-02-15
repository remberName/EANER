package a_1_7.user;

import a_1_7.management.UserManagement;

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
	 * @param pwd ユーザーpwd
	 * @return ログインDTO
	 */
	public LoginDto userLogin(String userName,String pwd) {
		return UserManagement.getUserInfo(userName, pwd);
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
