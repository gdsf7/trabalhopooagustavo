package com.trabalho.trabalho.Models;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByNome(String nome);
    List<User> findBySobrenome(String sobrenome);
    List<User> findByEmail(String email);
    List<User> findByTelefone(String telefone);
    List<User> findByMatricula(String matricula);
}
