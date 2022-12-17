package com.AshuIt.FirstPractice.Service;

import java.util.List;

import com.AshuIt.FirstPractice.model.User;


public interface ServiceI {
	
	public void saveUser(User user);
	
	public void saveAllUser(List<User> list);
	
	public User getByid(Integer userInteger);
	
	public List<User> getByAllUserId(List<Integer>list);
	
	public List<User> getAllUserData();
	
	public long CountUserData(Integer id);
	
	public void DeletById(Integer id);
	
	public void DeletByMultipleUserId(List<Integer>list);
	
	public void DeletAllUserData();
	

}
