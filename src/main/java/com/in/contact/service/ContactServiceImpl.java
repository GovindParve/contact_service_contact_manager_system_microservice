package com.in.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.in.contact.entity.Contact;

@Component
public class ContactServiceImpl implements ContactService {
	
	List<Contact> list = List.of(
			
			new Contact(1L, "govind@gmail.com", "Govind", 1311L),
			new Contact(2L, "govind@gmail.com", "Govind", 1311L),
			new Contact(3L, "mahesh@gmail.com", "Mahesh", 1312L),
			new Contact(4L, "vikas@gmail.com", "Vikas", 1313L)
		);
	
	private Long cId;
	private String email;
	private String contactName;
	private Long userId;
	
	@Override
	public List<Contact> getContactsOfUser(Long userId) {
		return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
	}
	
	
	
	

}
