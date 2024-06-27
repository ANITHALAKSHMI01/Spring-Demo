package com.chainsys.SpringMavenWebApp.dao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.chainsys.SpringMavenWebApp.mapper.UserMapper;
import com.chainsys.SpringMavenWebApp.model.User;
@Repository
public class UserDAOImpl implements UserDAO
{
	@Autowired
	JdbcTemplate jdbcTemplate;
	UserMapper mapper;
	
	@Override
	public void saveUser(User user) 
	{
		String insert="insert into user(name,phone_no,email,password,status)values(?,?,?,?,?)";
		Object[] params= {user.getName(),user.getPhoneNo(),user.getEmail(),user.getPassword(),user.getStatus()};
		jdbcTemplate.update(insert, params);
	}
	@Override
	public List<User> getAllUsers()
	{
		String select="select id,name,phone_no,email from user where status=1";
		List<User> userList=jdbcTemplate.query(select, new UserMapper());
		return userList;
	}
	@Override
	public void updateUser(User user)
	{
		String update="update user set phone_no=? where id=?";
		Object[] params= {user.getPhoneNo(),user.getId()};
		jdbcTemplate.update(update,params);
	}
	@Override
	public void deleteUser(User user) 
	{
		String update="update user set status=? where id=?";
		Object[] params= {user.getStatus(),user.getId()};
		jdbcTemplate.update(update,params);
	}
//	@Override
//	public void deleteUser(User user)
//	{
//		String delete="delete from user where id=?";
//		Object[] params= {user.getId()};
//		jdbcTemplate.update(delete,params);
//	}
//	@Override
//	public String selectUser(Integer id)
//	{
//		String select="select name from user where id=?";
//		String user=jdbcTemplate.queryForObject(select,String.class, id);
//		return user;
//	}
//	@Override
//	public List<User> selectUser(User user) 
//	{
//		String select="select id,name,phone_no,email from user where id=? && status=1";
//		Object[] params= {user.getId()};
//		List<User> userList=jdbcTemplate.query(select, new UserMapper(), params);
//		return userList;
//	}
	@Override
	public List<User> getUser()
	{
		String select="select phone_no,email from user where status=1";
		List<User> userList=jdbcTemplate.query(select, new UserMapper());
		return userList;
	}
	@Override
	public List<User> selectUser(String search) {
		String select=String.format("select id,name,phone_no,email from user where (id like '%%%s%%' or name like '%%%s%%' or email like '%%%s%%' or phone_no like '%%%s%%')  and status=1 ",search,search,search,search);
		List<User> userList=jdbcTemplate.query(select, new UserMapper());
		return userList;
	}
}
