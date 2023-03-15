package com.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Model.usersignup;
import com.Service.usersignupservice;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class usersignupcontoller {
	
	@Autowired
	private usersignupservice usercontroller;
	
	@PostMapping("/signupdata")
	public usersignup getdata(@RequestBody usersignup uu) {                           
		System.out.println(uu.getEmail());
		usersignup aa = (usersignup)this.usercontroller.adddata(uu);
		System.out.println(aa);
		return aa;
		
		
	}
	
	@GetMapping("/signupdata")
	public List<usersignup> getsignupdata(){
		List<usersignup> aa = (List<usersignup>) this.usercontroller.getdata();
		return aa;
		
	}

}
