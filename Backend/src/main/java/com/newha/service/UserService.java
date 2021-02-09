package com.newha.service;

import java.util.ArrayList;
import java.util.List;

import com.newha.vo.User;


public interface UserService {
	
	public ArrayList<User> selectAll();
	public ArrayList<Integer> follow(int userNo);

	public void insert(User u);
	public void delete(String id);
	public void update(User u);
	public User selectUser(int userNo);
	public User login(User u);
	public User userInfo(String id);
	public List<User> searchUser(String keyword);
	public int selectId(String id);
	public int userNo(String id);
	
	public void thumbnailPath(String userNo, String thumbnail_path);
	
	public void insertTag(String id, String tag);
	public void subscribe(String id, String id2);
	public void subscdelete(String id, String id2);
	public int selectName(String name);

}
