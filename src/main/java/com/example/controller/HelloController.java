package com.example.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContext;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@Autowired
	MessageSource messageSource;
	
	
	@GetMapping("/hello")
	public String hello(){
		//LocaleContext locale = null;
		return messageSource.getMessage("hi.message", null, LocaleContextHolder.getLocale());
	}
	
	@GetMapping("/set-langauge")
	public String hello(@RequestParam(name="lang",required = false) String lang){
		//LocaleContext locale = null;
		return lang;
	}

}
