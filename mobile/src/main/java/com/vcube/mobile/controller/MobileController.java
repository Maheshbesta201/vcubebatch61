package com.vcube.mobile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.vcube.mobile.model.Mobile;
import com.vcube.mobile.service.Mobileservice;

@Controller
public class MobileController {

	@Autowired
	private Mobileservice service;

	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("mobile", new Mobile());
		model.addAttribute("mobiles", service.getAllMobiles());
		return "index";
	}

	@PostMapping("/save")
	public String saveMobile(@ModelAttribute Mobile mobile) {
		service.saveMobile(mobile);
		return "redirect:/";
	}
	
	@GetMapping("/edit/{id}")
    public String editMobile(@PathVariable int id, Model model) {
        Mobile mobile = service.getMobileById(id);
        model.addAttribute("mobile", mobile);
        model.addAttribute("mobiles", service.getAllMobiles());
        return "index";
    }
	
    @GetMapping("/delete/{id}")
    public String deleteMobile(@PathVariable int id) {
        service.deleteMobile(id);
        return "redirect:/";
    }

	@GetMapping("/save")
	public String redirectSave() {
		return "redirect:/";
	}
}
