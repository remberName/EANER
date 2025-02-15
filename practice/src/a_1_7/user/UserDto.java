package a_1_7.user;
/**
 * [概要] <p>ユーザーDTOクラス。</p>
 * [説明] <p>ユーザーDTO。</p>
 * [補充] <p>特になし。</p>
 */
public class UserDto {
	
	/**
	 * ユーザーID
	 */
	private int userId;

	/**
	 * ユーザー名
	 */
	private String userName;
	
	/**
	 * ユーザー年齢
	 */
	private int userAge;
	
	/**
	 * ユーザー性別
	 */
	private String userSex;
	
	/**
	 * ユーザーアドレス
	 */
	private String userAddress;
	
	public UserDto(int userId, String userName, int userAge, String userSex, String userAddress) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userAge = userAge;
		this.userSex = userSex;
		this.userAddress = userAddress;
	}

	public UserDto() {
		super();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public String getUserSex() {
		return userSex;
	}

	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	
}
