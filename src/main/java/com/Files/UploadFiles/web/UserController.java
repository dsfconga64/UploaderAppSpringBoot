package com.Files.UploadFiles.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.Files.UploadFiles.domain.User;
import com.Files.UploadFiles.repository.UserRepository;




public class UserController {
	
	@Autowired
	UserRepository repo;
	
	@GetMapping("/")
	public String loginView(Model model) {
		model.addAttribute("login", new User());
		return "index";
	}
}
