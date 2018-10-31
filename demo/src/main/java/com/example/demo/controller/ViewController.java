package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {
	 @RequestMapping(value = "/index")
	   public String index() {
	      return "index";
	   }
	 
	 @RequestMapping("/view-products")
	   public String viewProducts() {
	      return "view-products";
	   }
	   @RequestMapping("/add-products")
	   public String addProducts() {
	      return "add-products";   
	   }   
	   
	   @RequestMapping("/locale")
	   public String locale() {
	      return "locale";
	   }
}