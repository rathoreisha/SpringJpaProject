package com.AshuIt.FirstPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.AshuIt.FirstPractice.Repository.UserRepo;
import com.AshuIt.FirstPractice.Service.ServiceImpl;
import com.AshuIt.FirstPractice.model.User;

@SpringBootApplication
public class FirstPractice2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(FirstPractice2Application.class, args);
		
		ServiceImpl bean = context.getBean(ServiceImpl.class);
		
//	    User u=new User();
	    
	    //****** Save Method *****
	    
//	    u.setId(2);
//	    u.setName("Amruta");
//	    u.setAge(25);
//	    u.setAddress("Pune");
//	    
//	    bean.saveUser(u);
//	    System.out.println(u);
	    
	    //****** SaveAll ********
	    
//	    u.setName("Uday");
//	    u.setAge(27);
//	    u.setAddress("Chalisgaon");
//	    
//	    User u1=new User();
//	    
//	    u1.setName("Niki");
//	    u1.setAge(28);
//	    u1.setAddress("Gujarat");
//
//	    User u2=new User();
//	    
//	    u.setName("piyu");
//	    u.setAge(27);
//	    u.setAddress("Bhusaval");
//	    
//	    List<User> list= new ArrayList();
//	    list.add(u);
//	    list.add(u1);
//	    list.add(u2);
//	    
//	      bean.saveAllUser(list);
//         System.out.println(list);
         
         //***** findById Method *****
	    
//	    User byid = bean.getByid(1);
//	    System.out.println(byid);
	    
	    // ****** FindAllById Method *****
		
//	     List<Integer> asList = Arrays.asList(2,3,5);
//		List<User> byAllUserId = bean.getByAllUserId(asList);
//		System.out.println(byAllUserId);
//		for(User use:byAllUserId) {
//			System.out.println(use);
//		}
		
		// ****  FindAll Method
		
//		List<User> allUserData = bean.getAllUserData();
//		System.out.println(allUserData);
//		
//		for(User us:allUserData) {
//			System.out.println(us);
//		}
		
	//Count method ExistById
      
//		long countUserData = bean.CountUserData(2);
//	    System.out.println(countUserData);
//	}
		
		// DeleteById Method
		
//		bean.DeletById(1);
//		System.out.println("Delete By id Succefull");
		
		//DeleteByAllId method (Multiple id)
		
//		List<Integer> asList = Arrays.asList(2,3);
//		bean.DeletByMultipleUserId(asList);
//		System.out.println(asList);
		
		//Delete All Data method
		
		bean.DeletAllUserData();
		
		
		
		
	}		

}
