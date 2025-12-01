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

    public List<User> buscaPorSobrenome(String sobrenome){
        return this.repository.findBySobrenome(sobrenome);
    }

    public List<User> buscaPorEmail(String email){
        return this.repository.findByEmail(email);
    }

    public List<User> buscaPorTelefone(String telefone){
        return this.repository.findByTelefone(telefone);
    }

    public List<User> buscaPorMatricula(String matricula){
        return this.repository.findByMatricula(matricula);
    }
}
