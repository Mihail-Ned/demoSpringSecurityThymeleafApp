package org.demospringsecuritythymeleafapp.repository;

import org.demospringsecuritythymeleafapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
