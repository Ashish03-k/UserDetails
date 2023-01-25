package com.userdetails.services;

import java.util.List;
import java.util.stream.Stream;

import com.userdetails.entities.Users;

public interface UserService {

	 public void saveUser(Users users);

	public List<Users> getUser();

	public Stream<Users> getByLimit(int limit);

	public List<Users> getByAge(int age);

	public Users getByName(String name);


}
