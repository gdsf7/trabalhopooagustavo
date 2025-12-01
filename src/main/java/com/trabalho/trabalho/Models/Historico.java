package com.trabalho.trabalho.Models;

import jakarta.persistence.*;
import lombok.*;

@Builder
@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Historico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "idAluno", nullable = false)
    private User aluno;

    @ManyToOne
    @JoinColumn(name = "idProfessor", nullable = false)
    private User professor;
}
