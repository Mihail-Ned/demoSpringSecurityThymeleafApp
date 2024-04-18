package org.demospringsecuritythymeleafapp.service;

import org.demospringsecuritythymeleafapp.dto.UserRegistrationDto;
import org.demospringsecuritythymeleafapp.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {

    User save(UserRegistrationDto registrationDto);

    List<User> getAll();

}
