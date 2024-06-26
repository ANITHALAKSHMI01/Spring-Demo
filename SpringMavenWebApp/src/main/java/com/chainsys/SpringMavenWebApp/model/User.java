package com.chainsys.SpringMavenWebApp.model;
public class User
{
	int id;
	String name;
	long phoneNo;
	String email;
	String password;
	int status;
	public User()
	{
		
	}
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public long getPhoneNo() 
	{
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo)
	{
		this.phoneNo = phoneNo;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	public String getPassword() 
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	public int getStatus()
	{
		return status;
	}
	public void setStatus(int status)
	{
		this.status = status;
	}
	@Override
	public String toString() 
	{
		return "User [id=" + id + ", name=" + name + ", phoneNo=" + phoneNo + ", email=" + email + ", password="
				+ password + ", status=" + status + "]";
	}
}
