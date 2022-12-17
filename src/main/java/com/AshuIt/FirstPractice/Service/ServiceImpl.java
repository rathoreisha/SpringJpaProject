package com.AshuIt.FirstPractice.Service;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AshuIt.FirstPractice.Repository.UserRepo;
import com.AshuIt.FirstPractice.model.User;


@Service
public class ServiceImpl implements ServiceI {

	
	@Autowired
	private UserRepo userRepo;
	@Override
	public void saveUser(User user) {
		
		userRepo.save(user);
		
	}
	@Override
	public void saveAllUser(java.util.List<User> list) {
      
		
		Iterable<User> saveAll = userRepo.saveAll(list);
		
		
	}
	@Override
	public User getByid(Integer userInteger) {
		
        User findById = userRepo.findById(userInteger).get();
		return findById;
	}

	@Override
	public List<User> getByAllUserId(List<Integer> list) {
		List<User> findAll = (List<User>) userRepo.findAllById(list);
		return findAll;
	}
	@Override
	public List<User> getAllUserData() {
		
		List<User> findAll = (List<User>)userRepo.findAll();
		return findAll;
	}
	@Override
	public long CountUserData(Integer id) {
		
		long count = userRepo.count();
		
		return count;
	}
	@Override
	public void DeletById(Integer id) {
		
		userRepo.deleteById(id);
		
		
	}
	@Override
	public void DeletByMultipleUserId(List<Integer> list) {
       userRepo.deleteAllById(list);		
	}
	@Override
	public void DeletAllUserData() {
     userRepo.deleteAll();		
	}

}
