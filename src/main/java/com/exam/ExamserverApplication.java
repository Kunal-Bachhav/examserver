package com.exam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExamserverApplication implements org.springframework.boot.CommandLineRunner {

	@org.springframework.beans.factory.annotation.Autowired
	private com.exam.service.UserService userService;
	public static void main(String[] args) {
		SpringApplication.run(ExamserverApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Starting code......");
		com.exam.model.User user = new com.exam.model.User();
		user.setFirstName("Kunal");
		user.setLastName("Bachhav");
		user.setUserName("BeardKid_014");
		user.setPassword("Kunal@1429");
		user.setEmail("kunalb2808@gmail.com");
		user.setProfile("profile.png");

		com.exam.model.Role role1 = new com.exam.model.Role();
		role1.setRoleId(101L);
		role1.setRoleName("ADMIN");

		java.util.Set<com.exam.model.UserRole> userRoleSet = new java.util.HashSet<>();
		com.exam.model.UserRole userRole = new com.exam.model.UserRole();
		userRole.setRole(role1);
		userRole.setUser(user);
		userRoleSet.add(userRole);

		com.exam.model.User user1 =this.userService.createUser(user,userRoleSet);
		System.out.println(user1.getUserName());


	}
}
