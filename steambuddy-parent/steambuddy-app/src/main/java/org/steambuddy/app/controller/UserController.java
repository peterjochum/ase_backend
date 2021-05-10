package org.steambuddy.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.steambuddy.api.UserResource;
import org.steambuddy.api.dto.MessageDTO;
import org.steambuddy.api.dto.RatingDTO;
import org.steambuddy.api.dto.UserDTO;
import org.steambuddy.app.service.UserService;

@RestController
public class UserController implements UserResource{

	@Autowired
	private UserService userService;
	
	@Override
	public UserDTO authenticateUser(UserDTO user) {
		return userService.authenticateUser(user);
	}

	@Override
	public UserDTO registerUser(UserDTO user) {
		return userService.registerUser(user);
	}

	@Override
	public UserDTO updateUser(UserDTO user) {
		return userService.updateUser(user);
	}

	@Override
	public List<UserDTO> getUsers() {
		return userService.getUsers();
	}

	@Override
	public UserDTO getUserById(Long id) {
		return userService.getUserById(id);
	}
	
	@Override
	public MessageDTO sendMessage(MessageDTO message) {
		return userService.sendMessage(message);
	}
	
	@Override
	public List<MessageDTO> getMessages(Long id) {
		return userService.getMessages(id);
	}



}
