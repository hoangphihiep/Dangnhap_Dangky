package vn.iotstar.services;

import vn.iotstar.models.UserModel;

public interface IUserServices {
	
	UserModel findByUserName(String username);
	
	UserModel login(String username, String password);
}
