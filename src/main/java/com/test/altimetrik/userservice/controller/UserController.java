package com.test.altimetrik.userservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.test.altimetrik.userservice.bean.Welcome;

@RestController
@RequestMapping("/users")
public class UserController {
	
	   @RequestMapping(method = RequestMethod.GET)
	    @ResponseStatus(HttpStatus.OK)
	    public Welcome greetings(@RequestParam("name") String name) {
	        return new Welcome(name);
	    }

}
