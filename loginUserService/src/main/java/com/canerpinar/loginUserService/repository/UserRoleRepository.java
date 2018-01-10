package com.canerpinar.loginUserService.repository;

import java.util.List;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.canerpinar.loginUserService.entity.UserRole;

@Repository
public interface UserRoleRepository extends CrudRepository<UserRole,Long> {
	
	@Query("select r.role from UserRole r,Users user where user.userName=:username and r.userId=user.id")
	public List<String> findRoleByUsername(@Param("username") String username);
}
