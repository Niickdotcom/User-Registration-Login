package com.example.demo;


import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.demo.Entity.UserEntity;
import com.example.demo.dao.UserRepo;
import com.example.demo.service.UserService;

@SpringBootTest
class RegistrationMavenUserApplicationTests {

	@Test
	void contextLoads() {
	}
	
	
	@Autowired
	UserRepo repo;
	
	@MockBean
	UserService Service;
	
	
//	@Test
//	public void User() {
//		List<UserEntity> user = (List<UserEntity>) repo.findAll();
//		assertThat(user).hasSizeGreaterThan(0);
//	}
//	
//	@Test
//	public void saveuser() {
//		UserEntity usr = new UserEntity(0,"rkkk","rl","lr",441144.00,"aa","fff");
//		when(repo.save(usr)).thenReturn(usr);
//		assertEquals(usr, Service.save(usr));
//	}
	
	@Test
	public void deleteUserTest() {
		try {
			UserEntity user = new UserEntity(4,"vk99","vivek","sing",99.12,"vk@gmail.com","NSP");
			Service.deleteUser(user);
			verify(repo, times(1)).delete(user);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
	
}
