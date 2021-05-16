package com.riya.PhoneDirectory.controller;

import com.riya.PhoneDirectory.model.Users;
import com.riya.PhoneDirectory.service.userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.RequestWrapper;

@RestController   //
public class UserController
{
    @Autowired
    private userservice service;
    @RequestMapping(value="/users", method= RequestMethod.POST)
    public void addUser(@RequestBody Users user)
    {
       service.addValue(user);
    }
}
