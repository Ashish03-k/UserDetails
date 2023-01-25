package com.userdetails.services;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userdetails.entities.Users;
import com.userdetails.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userrepository;

	@Override
	public void saveUser(Users users) {
		userrepository.save(users);

	}

	@Override
	public List<Users> getUser() {
		List<Users> user = userrepository.findAll();
		return user;

	}

	@Override
	public Stream<Users> getByLimit(int limit) {
		Stream<Users> user = userrepository.findAll().stream().limit(limit);
		return user;
	}

	@Override
	public List<Users> getByAge(int age) {
		List<Users> user = userrepository.getByAge(age);
		return user;
	}

	@Override
	public Users getByName(String name) {
		Users byname = userrepository.getByname(name);
		return byname;
	}


}
