package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.UserEntity;
import com.example.demo.dao.UserRepo;

@Service
public class UserService {

	@Autowired
	UserRepo repo;
	
	
	
	public List<UserEntity> findAll() {
		return repo.findAll();
	}
	
	
	public void save(UserEntity data) {
		repo.save(data);
	}
	
	
	public UserEntity findByuserName(String username){
		return repo.findByUsername(username);
	}
	
	
	
	public void delete(int id) {
		repo.deleteById(id);
	}


	public UserEntity findById(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}


	public void deleteUser(UserEntity user) {
		repo.delete(user);
		
	}
	
	
	
	
	
}
