package com.in.contact.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.in.contact.entity.Contact;

@Service
public interface ContactService {
	
	public List<Contact> getContactsOfUser(Long userId);

}
