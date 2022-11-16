package SpringBoot.com.Register_Login_SpringBoot_App.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import SpringBoot.com.Register_Login_SpringBoot_App.DAO.StudentDAO;
import SpringBoot.com.Register_Login_SpringBoot_App.DTO.Student;

@RestController
public class StudentController 
{
	@Autowired
	StudentDAO dao;
	
	@PostMapping("/register")
	public Student saveUser(@RequestBody Student user)
	{
		return dao.saveUser(user);	
	}
	
	@GetMapping("/login")
	public String validateUser(@RequestBody Student user)
	{
		boolean b=dao.validateUser(user);
		if(b==true)
		{
			return "Login Successfull";
		}
		return "Invalid Username or Password";		
	}
}
