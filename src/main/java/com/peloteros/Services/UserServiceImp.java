package com.peloteros.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.peloteros.Entity.UserEntity;
import com.peloteros.Repository.UserRepository;

@Service
public class UserServiceImp implements UserService {

	@Autowired UserRepository UserRep;
	
	@Override
	public List<UserEntity> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserEntity> findAllCustom() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<UserEntity> findById(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Optional<UserEntity> findOnebyEmail(String xemail) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public UserEntity add(UserEntity u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserEntity update(UserEntity u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserEntity delete(UserEntity u) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
