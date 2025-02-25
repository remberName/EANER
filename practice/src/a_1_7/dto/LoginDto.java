package a_1_7.dto;

/**
 * [概要] <p>ユーザーログイン情報DTO。</p>
 * [説明] <p>ユーザーのニックネームとパスワードDTO。</p>
 * [補充] <p>。</p>
 */
public class LoginDto {

	/**
	 * ユーザーID
	 */
	private int userId;
	
	/**
	 * ユーザーニックネーム
	 */
	private String nickName;
	
	/**
	 * ユーザーパスワード
	 */
	private String password;

	public LoginDto() {
		super();
	}

	public LoginDto(int userId, String nickName, String password) {
		super();
		this.userId = userId;
		this.nickName = nickName;
		this.password = password;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
