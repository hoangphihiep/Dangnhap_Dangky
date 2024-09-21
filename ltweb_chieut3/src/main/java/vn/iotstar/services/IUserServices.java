package vn.iotstar.services;

import vn.iotstar.models.UserModel;

public interface IUserServices {
	
	UserModel findByUserName(String username);
	
	UserModel login(String username, String password);
	
	void insert(UserModel user);
	
	boolean register(String username, String email, String password, String
	fullname, String phone);
	
	boolean checkExistEmail(String email);
	
	boolean checkExistUsername(String username);
	
	boolean checkExistPhone(String phone);
}
