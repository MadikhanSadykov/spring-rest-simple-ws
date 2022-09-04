package com.madikhan.app.ws.service;

import com.madikhan.app.ws.shared.dto.UserDTO;
import org.springframework.stereotype.Service;

public interface UserService {

    UserDTO createUser(UserDTO user);
}
