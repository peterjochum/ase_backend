package org.steambuddy.app.service;

import java.util.List;

import org.steambuddy.api.dto.MessageDTO;
import org.steambuddy.api.dto.UserDTO;
import org.steambuddy.app.entity.UserEntity;

public interface UserService {

	UserDTO authenticateUser(UserDTO user);
	
	UserDTO registerUser(UserDTO user);
	
	UserDTO updateUser(UserDTO user);
	
	List<UserDTO> getUsers();
	
	UserDTO getUserById(Long id);
	
	void addFriend(UserEntity user, UserEntity friend);
	
	MessageDTO sendMessage(MessageDTO message);
	
	List<MessageDTO> getMessages(Long id);
}
