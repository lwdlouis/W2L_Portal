package org.w2l.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/user")
public class UserControler {

	
	@RequestMapping(value = "/loginPage")
	public String userLogin(){
		
		return "login";
	}
	
}
