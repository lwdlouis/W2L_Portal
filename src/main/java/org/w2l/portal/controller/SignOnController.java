package org.w2l.portal.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/signOn")
public class SignOnController {
	private static final Logger logger = LoggerFactory.getLogger(SignOnController.class);

	@RequestMapping(value = "/signOnPage", method = RequestMethod.GET)
	public String signOn(Model model){
		
		logger.info("test sign on...");
		
		
		
		return "signon";
	}
}
