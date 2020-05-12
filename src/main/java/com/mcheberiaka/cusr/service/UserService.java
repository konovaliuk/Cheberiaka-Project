package com.mcheberiaka.cusr.service;

import com.mcheberiaka.cusr.model.User;

public interface UserService {
	public User findUser();
	public void signInAuthentication(String firebaseToken);
	public void signout();
	public User getUserFromDB(String email);
}
