package com.riya.PhoneDirectory.service;

import com.riya.PhoneDirectory.model.Users;
import com.riya.PhoneDirectory.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userservice
{
    @Autowired
    private UserRepository userrepository;
    public void addValue(Users user)
    {
        //.save
        userrepository.save(user);
    }
}
