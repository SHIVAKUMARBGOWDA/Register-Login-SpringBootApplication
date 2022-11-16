package SpringBoot.com.Register_Login_SpringBoot_App.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import SpringBoot.com.Register_Login_SpringBoot_App.DTO.Student;
import SpringBoot.com.Register_Login_SpringBoot_App.Repository.StudentRepository;

@Repository
public class StudentDAO
{
	@Autowired
	StudentRepository repository;
	
	public Student saveUser(Student user)
	{
		return repository.save(user);
	}
		
	public boolean validateUser(Student user)
	{
		Student u=repository.validateUser(user.getUsername(), user.getPassword());
		if(u!=null)
		{
			return true;
		}
		return false;
	}

}
