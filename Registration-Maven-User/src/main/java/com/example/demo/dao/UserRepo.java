package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.UserEntity;



@Repository
public interface UserRepo extends JpaRepository<UserEntity, Integer> {
	
	
	public UserEntity findByUsername(String username);

	

}
