package com.app.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.model.User;
import com.app.service.IUserService;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
		IUserService u = (IUserService) ac.getBean("serviceUserImpl");
		
		  User user = new User(); user.setUserId(3);
		  user.setUserName("RAVI SAM Sharma"); user.setUserCode("Uss5"); u.save(user);
		  System.out.println("Saved data successful");
		 
		/*
		 * User user = new User(); user.setUserId(3); user.setUserName("VickyRajkumar");
		 * user.setUserCode("psdf"); u.update(user);
		 * System.out.println("update succesful");
		 */
		/*
		 * //Delete operation User user = new User(); user.setUserId(3); u.delete(3);
		 * System.out.println(3+" user deleted");
		 */
//retrive data in list<User>
//		List<User> list = u.getAllUsers();
//		for (User user : list)
//			System.out.println(user);
//retrive only one user data` /
		/*
		 * User user = u.getUserById(2); System.out.println(user);
		 */
//HibernateTransactionManagerhh;
// hh.setSessionFactory(sessionFactory);
	}
}