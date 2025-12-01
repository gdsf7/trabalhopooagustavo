package com.trabalho.trabalho.Models;

import jakarta.persistence.*;
import lombok.*;

@Builder
@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Material {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false)
    private String descricao;

    @Column
    private String anexo;

    @ManyToOne
    @JoinColumn(name = "idProfessor", nullable = false)
    private User professor;

    @ManyToOne
    @JoinColumn(name = "idDisciplina", nullable = false)
    private Disciplina disciplina;

    @ManyToOne
    @JoinColumn(name = "idAluno", nullable = false)
    private User aluno;
}
