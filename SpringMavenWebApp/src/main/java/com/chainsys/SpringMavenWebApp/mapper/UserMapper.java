package com.chainsys.SpringMavenWebApp.mapper;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.chainsys.SpringMavenWebApp.model.User;
public class UserMapper implements RowMapper<User>
{
	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException 
	{
		User user=new User();
		int id=rs.getInt(1);
		String name=rs.getString(2);
		long phoneNo=rs.getLong(3);
		String email=rs.getString(4);
		user.setId(id);
		user.setName(name);
		user.setPhoneNo(phoneNo);
		user.setEmail(email);
		user.setStatus(1);
		return user;
	}

}
