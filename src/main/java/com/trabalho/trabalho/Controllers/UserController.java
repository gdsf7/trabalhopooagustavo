package com.trabalho.trabalho.Controllers;

import com.trabalho.trabalho.Models.Services.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.trabalho.trabalho.Models.User;
import java.util.List;

@RestController
@RequestMapping
public class UserController extends Controller<User, UserService> {
    public UserController(UserService user) {
        super(user);
    }

    @GetMapping("buscar-nome/{nome}")
    public List<User> buscarPorNome(@PathVariable String nome) {
        return service.buscaPorNome(nome);
    }
}
