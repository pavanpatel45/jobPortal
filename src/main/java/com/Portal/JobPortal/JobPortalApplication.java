package com.Portal.JobPortal;

import com.Portal.JobPortal.Constants.UserRole;
import com.Portal.JobPortal.Dao.UserRepository;
import com.Portal.JobPortal.Entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JobPortalApplication {

	public static void main(String[] args) {
		ApplicationContext Context =  SpringApplication.run(JobPortalApplication.class, args);
		UserRepository userRepository = Context.getBean(UserRepository.class);
		User user = new User();
		user.setUserName("pavan4517patel");
		user.setPassword("1234");
		user.setEmail("Pavan4517patel@gmail.com");
		user.setFirstName("Pavan");
		user.setLastName("Patel");
		user.setUserRole(UserRole.EMPLOYER);
		user.setPhoneNumber("6263291951");
		user.setAddress("Indore");
        User user1 = userRepository.save(user);
		System.out.println(user1);
	}

}
