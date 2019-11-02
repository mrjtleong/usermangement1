/**
 * @program: usermanagerment
 * @Description: Establish user login and registration page
 * @author: JT
 * @date: 2019-10-30 
 */
package com.jt.usermangement;

/**
 * @author JT
 * @date   2019-10-30
 */
//�û��ӿ�
public interface UserService {
	

	public int login(User user);
	

	public int register(User user);
}
