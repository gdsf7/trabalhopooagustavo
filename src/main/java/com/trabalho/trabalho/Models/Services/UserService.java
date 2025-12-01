package com.trabalho.trabalho.Models.Services;

import com.trabalho.trabalho.Models.User;
import com.trabalho.trabalho.Models.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService extends BaseService<User, UserRepository> {
    public UserService(UserRepository userRepository) {
        super(userRepository);
    }
}
