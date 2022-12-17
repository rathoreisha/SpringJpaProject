package com.AshuIt.FirstPractice.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.AshuIt.FirstPractice.model.User;
@Repository
public interface UserRepo extends CrudRepository<User, Integer> {

}
