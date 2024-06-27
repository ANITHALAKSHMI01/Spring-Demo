package com.chainsys.SpringMavenWebApp.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.chainsys.SpringMavenWebApp.dao.UserDAO;
import com.chainsys.SpringMavenWebApp.model.User;
@Controller
public class MyController 
{
	@Autowired
	UserDAO userDAO;
	
	@RequestMapping("/home")
	public String home()
	{
		return "home.jsp";
	}
	@PostMapping("/register")
	public String register(@RequestParam("name") String name,@RequestParam("phoneNo") Long phoneNo,@RequestParam("email") String emailId,@RequestParam("password") String password)
	{
		User user=new User();
		user.setName(name);
		user.setEmail(emailId);
		user.setPhoneNo(phoneNo);
		user.setPassword(password);
		user.setStatus(1);
		userDAO.saveUser(user);
		return "success.jsp";
	}
	@GetMapping("/view")
	public String viewAllUsers(Model model)
	{
		List<User> users=userDAO.getAllUsers();
		model.addAttribute("users",users);
		return "userTable.jsp";
	}
	@GetMapping("/update")
	public String updateUser(@RequestParam("id") Integer id,@RequestParam("phoneNo") Long phoneNo,Model model)
	{
		User user=new User();
		user.setId(id);
		user.setPhoneNo(phoneNo);
		userDAO.updateUser(user);
		List<User> users=userDAO.getAllUsers();
		model.addAttribute("users",users);
		return "userTable.jsp";
	}
	@GetMapping("/delete")
	public String deleteUser(@RequestParam("id") Integer id,Model model)
	{
		User user=new User();
		user.setId(id);
		user.setStatus(0);
		userDAO.deleteUser(user);
		List<User> users=userDAO.getAllUsers();
		model.addAttribute("users",users);
		return "userTable.jsp";
	}
	@GetMapping("/search")
	public String selectUser(@RequestParam("searchData") String search,Model model)
	{
		List<User> users=userDAO.selectUser(search);
		model.addAttribute("users",users);
		return "userTable.jsp";
	}
//	@RequestMapping("/success")
//	public String success()
//	{
//		return "success.jsp";
//	}
}
