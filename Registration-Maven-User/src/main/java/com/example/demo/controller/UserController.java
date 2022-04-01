package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Entity.UserEntity;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {

	
	@Autowired
	UserService service;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public List<UserEntity> findAll(){
		return service.findAll();
	}
	
	@RequestMapping(value = "/findbyusename/{username}", method = RequestMethod.GET)
	public String findByuserName(@PathVariable("username") String name) {
		String msg ="";
		if(service.findByuserName(name) != null) {
			service.findByuserName(name);
			
			msg = "verified Successfully";
		} else {
			msg = "Authentication fail";
		}
		
		return msg;
		
	}
	
	@RequestMapping(value = "/user/insert", method = RequestMethod.POST)
	public String save(@RequestBody  UserEntity usr){
		service.save(usr);
		return "data inserted";
	}
	
	@RequestMapping(value = "/user/update/{id}", method = RequestMethod.PATCH)
	public String updateUserEntity(@RequestBody UserEntity usr){
		service.save(usr);
		return "data updated";
	}
	
	@RequestMapping(value = "/deletebyid/{id}", method = RequestMethod.DELETE)
	public String deletbyid(@PathVariable int id) {
		String msg="";
		if(service.findById(id) != null) {
			service.delete(id);
			
			msg = "deleted success";
		} else {
			msg = "No Data Found";
		}
		return msg;
		
	}
	
	
	
}
