package com.canerpinar.loginUserService.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.canerpinar.loginUserService.entity.Users;

@Repository
public interface UserRepository extends CrudRepository<Users, Long> {
	public Users findByUserName(String userName);
}
