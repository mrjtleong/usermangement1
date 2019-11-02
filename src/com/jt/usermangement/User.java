/**
 * @program: usermanagerment
 * @Description: Encapsulate user name and password
 * @author: JT
 * @date: 2019-10-30
 */
package com.jt.usermangement;

/**
 * @author Administrator
 * @date   2019-10-30
 */
public class User {
	
	private String username;

	private String userpassword;
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getUserpassword() {
		return userpassword;
	}
	
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	
}
