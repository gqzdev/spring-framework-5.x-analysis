package com.gqz.spring;
/**
 * @ClassName
 * @Description
 * @Author ganquanzhong
 * @Date2019/9/7 23:15
 * @Version V1.0
 **/
public class User {
	private int uid;
	private String username;
	private String pwd;

	public User(int uid, String username, String pwd) {
		this.uid = uid;
		this.username = username;
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "User{" +
				"uid=" + uid +
				", username='" + username + '\'' +
				", pwd='" + pwd + '\'' +
				'}';
	}
}
