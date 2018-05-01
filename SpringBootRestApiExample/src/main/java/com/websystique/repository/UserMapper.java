package com.websystique.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.websystique.model.User;

@Mapper
public interface UserMapper {
	@Insert("insert into user(name, age salary) values(#{name},#{age},#{salary}")
	public void saveUser(User user);
	
	@Update("update User set name=#{name}, age=#{age}, salary=#{salary} where id = #{id}")
	public void updateUser(User user);
	
	@Delete("delete from User where id = #{id}")
	public void deleteById(long id);
	
	@Delete("delete from User")
	public void deleteAllUsers();
	
	@Select("select * from User")
	@ResultType(User.class)
	public List<User> findAllUsers();	
	
	@Select("select * from User where id = #{id}")
	public User selectById(long id);
		
	boolean isUserExist(User user);
	
}
