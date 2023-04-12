package com.Tns.userservice1;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class Userservice1 {
	@Autowired
	private User_Service1_repository repo;
	public List<User> listAll()
	{
		return repo.findAll();
	}
	public User get(Integer u_id)
	{
		return repo.findById(u_id).get();
		
	}
	public void delete(Integer u_id)
	{
		repo.deleteById(u_id);
		
	}
	public void save(User usr) {
		repo.save(usr);
	}
	

}
