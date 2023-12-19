package com.flexmoney.controller;

import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.flexmoney.entity.User;
import com.flexmoney.services.UserServices;

@Controller
public class AdmissionController {
	
	
	@Autowired
	UserServices userServices;
    
    
    @GetMapping("/home")
    public String homePage()
    {
    	return "index";
    }
    
    @GetMapping("/enrollment")
    public String showEnrollmentForm(Model model) {
        
        return "admission";
    }
    
    @PostMapping("/saveuser")
    public String saveNewUser(@RequestParam String name,@RequestParam String username,@RequestParam int age,@RequestParam String selectedBatch,@RequestParam @DateTimeFormat(pattern = "dd-MM-yyyy") LocalDate joiningDate,@RequestParam String utrNumber)
    {
    	boolean saved=userServices.saveNewUser(name,username, age, selectedBatch, joiningDate, utrNumber);
    	if(saved)
    	{
    		return "redirect:/success";
    	}
    	else {
			return "redirect:/error";
		}
    }
    
    @GetMapping("/success")
    public String successPage() {
        return "index";
	}
    
    @GetMapping("/error")
    public String errorPage() {
        return "admission"; 
    }
    
    @GetMapping("/renew")
    public String renewAdmission()
    {
    	
    	return "payment";
    }
    
    @PutMapping("/renewdata/{username}")
    public ResponseEntity<User> renewAdmissionData(
        @PathVariable String username,
        @RequestParam String utr
    ) {
        User updatedUser =userServices.updateAdmission(username, utr);
        if (updatedUser != null) {
            return new ResponseEntity<>(updatedUser, HttpStatus.OK);
        } else {
        	System.out.println("Resource not found");
        	return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }
    }
    
}
