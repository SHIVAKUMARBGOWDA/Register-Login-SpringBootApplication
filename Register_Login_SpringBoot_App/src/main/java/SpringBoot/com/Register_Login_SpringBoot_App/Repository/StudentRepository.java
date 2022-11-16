package SpringBoot.com.Register_Login_SpringBoot_App.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import SpringBoot.com.Register_Login_SpringBoot_App.DTO.Student;


public interface StudentRepository extends JpaRepository<Student, String>
{

	@Query("select u from Student u where u.username=?1 AND u.password=?2") 
	Student validateUser(String username,String password);
}
