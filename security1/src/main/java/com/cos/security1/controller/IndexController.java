package com.cos.security1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
@GetMapping({"","/"})
public String index() {
	return "index";
	
	}
@GetMapping("/user")
public String user(){
	return "user";
}
@GetMapping("/admin")
public String admin(){
	return "admin";
}
@GetMapping("/manger")
public String manager(){
	return "manager";
}

@GetMapping("/login")
public String login(){
	return "login";
}
@GetMapping("/join")
public String join(){
	return "join";
}
@GetMapping("/joinProc")
public String joinProc(){
	return "login";
}
}
