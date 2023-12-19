package com.flexmoney.services;


import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.flexmoney.dao.UserRepository;
import com.flexmoney.entity.User;

@Service
public class UserServices {
	
	@Autowired
	UserRepository userRepository;

	
	public boolean saveNewUser(String Name,String username,int age,String selectedBatch,LocalDate joiningDate,String utrNumeber) {
		User user=new User(Name,username,age,selectedBatch,joiningDate, utrNumeber);
		userRepository.save(user);
		return true;
	}
	
	public User updateAdmission(String username, String utrNumber) {
        Optional<User> optionalUser = Optional.ofNullable(userRepository.findByUsername(username));
        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            user.setFirstJoiningUtr(utrNumber);
            return userRepository.save(user);
        }
        return null;
    }
}
