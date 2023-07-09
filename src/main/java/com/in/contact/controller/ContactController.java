package com.in.contact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in.contact.entity.Contact;
import com.in.contact.service.ContactService;

@RestController
@RequestMapping("/contact")
public class ContactController {
	
	@Autowired
	ContactService contactService;
	
	@GetMapping("/user/{userId}")
	public List<Contact> getUser(@PathVariable("userId") Long userId)
	{
		return this.contactService.getContactsOfUser(userId);
	}

}
