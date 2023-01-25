package com.userdetails.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.userdetails.entities.Users;

public interface UserRepository extends JpaRepository<Users, String> {
	
	@Query
	(value="SELECT *, TIMESTAMPDIFF(YEAR, date_of_birth, CURDATE()) AS age FROM users WHERE TIMESTAMPDIFF(YEAR, date_of_birth, CURDATE()) > :age",nativeQuery=true)
	public List<Users> getByAge(@Param("age") int age);

	
	@Query
	(value="select * from users where user_name=:name",nativeQuery=true)
	public Users getByname(@Param("name") String name);


}
