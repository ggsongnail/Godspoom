package com.spoom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spoom.entity.User;
import com.spoom.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String list(){
		return "user";
	}
	
	@ResponseBody
	@RequestMapping(value="json",method = RequestMethod.GET)
	public List<User> listjson(){
		return userService.findAll();
	}
}
