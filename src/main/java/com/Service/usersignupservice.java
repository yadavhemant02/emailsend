package com.Service;

import java.util.List;

import org.apache.jasper.compiler.ErrorDispatcher;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.Model.usersignup;
import com.Repository.usersignuprepository;

@Service
public class usersignupservice {
	
	@Autowired
	private usersignuprepository userservice;
	
	public usersignup adddata(usersignup uu) {
		List<usersignup> ss = (List<usersignup>)this.userservice.findAll();
		System.out.println(ss.get(0).getEmail());
		for (int i=0;i<ss.size();i++) {
			if(ss.get(i).getUsername().equals(uu.getUsername())) {
				 return null;
			}
		}
		usersignup aa = (usersignup)this.userservice.save(uu);
		return aa;
		
	}
	
	public List<usersignup> getdata(){
		
		List<usersignup> aa = (List<usersignup>)this.userservice.findAll();
		return aa;
	}

}
