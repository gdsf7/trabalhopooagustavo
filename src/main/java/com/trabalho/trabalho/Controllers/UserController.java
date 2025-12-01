package com.trabalho.trabalho.Controllers;

import com.trabalho.trabalho.Models.Services.UserService;
import org.springframework.web.bind.annotation.*;
import com.trabalho.trabalho.Models.User;
import java.util.List;

@RestController
@RequestMapping
public class UserController extends Controller<User, UserService> {
    public UserController(UserService user) {
        super(user);
    }

    @PostMapping("criar-usuario")
    public void criarUsuario(@RequestBody User user) {
        this.service.create(user);
    }

    @GetMapping("buscar-usuario-nome/{nome}")
    public List<User> buscarPorNome(@PathVariable String nome) {
        return service.buscaPorNome(nome);
    }

    @GetMapping("buscar-usuario-sobrenome/{sobrenome}")
    public List<User> buscarPorSobrenome(@PathVariable String sobrenome) {
        return service.buscaPorSobrenome(sobrenome);
    }

    @GetMapping("buscar-usuario-email/{email}")
    public List<User> buscarPorEmail(@PathVariable String email) {
        return service.buscaPorEmail(email);
    }

    @GetMapping("buscar-usuario-telefone/{telefone}")
    public List<User> buscarPorTelefone(@PathVariable String telefone) {
        return service.buscaPorTelefone(telefone);
    }

    @GetMapping("buscar-usuario-matricula/{matricula}")
    public List<User> buscarPorMatricula(@PathVariable String matricula) {
        return service.buscaPorMatricula(matricula);
    }
}
