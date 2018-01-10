package com.canerpinar.loginUserService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.canerpinar.loginUserService.entity.Users;
import com.canerpinar.loginUserService.repository.UserRepository;
import com.canerpinar.loginUserService.repository.UserRoleRepository;

@Service
public class CustomUserDetailService implements UserDetailsService {

	private final UserRepository userRepository;
	private final UserRoleRepository userRoleRepository;

	@Autowired
	public CustomUserDetailService(UserRepository userRepository, UserRoleRepository userRoleRepository) {
		this.userRepository = userRepository;
		this.userRoleRepository = userRoleRepository;
	}


	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Users user = userRepository.findByUserName(username);
		if(user == null){
			throw new UsernameNotFoundException("No user"+username);
		}else{
			List<String> userRole = userRoleRepository.findRoleByUsername(username);
			return new CustomUserDetails(user,userRole);
		}

	}

}
