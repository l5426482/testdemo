package com.iss.mapper;

import java.util.List;

import com.iss.entity.User;

/**
 * 
 * @author liu
 *
 */
public interface UserMapper {
	/**
	 * 返回所有用户的集合
	 * @return List<User>
	 */
	public List<User> selectAll();

}
