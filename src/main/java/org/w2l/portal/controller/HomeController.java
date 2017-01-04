package org.w2l.portal.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "/home")
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Into home index...");
		
		return "index";
	}
	
	@RequestMapping(value = "/wedding", method = RequestMethod.GET)
	public String wedding(Locale locale, Model model) {
		logger.info("Into home index...");
		
		return "wedding";
	}
	
	@RequestMapping(value = "/sports", method = RequestMethod.GET)
	public String sports(Locale locale, Model model) {
		logger.info("Into home sports...");
		
		return "sports";
	}
	
	@RequestMapping(value = "/industrial", method = RequestMethod.GET)
	public String industrial(Locale locale, Model model) {
		logger.info("Into home industrial...");
		
		return "industrial";
	}
	
	@RequestMapping(value = "/fashion", method = RequestMethod.GET)
	public String fashion(Locale locale, Model model) {
		logger.info("Into home fashion...");
		
		return "fashion";
	}
	
	@RequestMapping(value = "/agriculture", method = RequestMethod.GET)
	public String agriculture(Locale locale, Model model) {
		logger.info("Into home agriculture...");
		
		return "agriculture";
	}
	
}
