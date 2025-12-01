package com.trabalho.trabalho.Models.Services;

import com.trabalho.trabalho.Models.User;
import com.trabalho.trabalho.Models.UserRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService extends BaseService<User, UserRepository> {
    public UserService(UserRepository userRepository) {
        super(userRepository);
    }

    public List<User> buscaPorNome(String nome){
        return this.repository.findByNome(nome);
    }
}
