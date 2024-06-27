package com.chainsys.SpringMavenWebApp.dao;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.chainsys.SpringMavenWebApp.model.User;
@Repository
public interface UserDAO
{
	public void saveUser(User user);
	public List<User> getAllUsers();
	public void updateUser(User user);
	public void deleteUser(User user);
//	public String selectUser(Integer id);
//	public List<User> selectUser(User user);
	public List<User> selectUser(String search);
	public List<User> getUser();
}
