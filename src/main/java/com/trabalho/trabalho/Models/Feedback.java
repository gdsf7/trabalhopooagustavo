package com.trabalho.trabalho.Models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;

@Builder
@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String texto;

    @Column
    private String anexo;

    @ManyToOne
    @JoinColumn(name = "idAluno", nullable = false)
    private User aluno;

    @ManyToOne
    @JoinColumn(name = "idProfessor", nullable = false)
    private User professor;

    @Column
    private String resp_familia;

    @Column
    private LocalDate resp_data;

    @ManyToOne
    @JoinColumn(name = "idGuardiao", nullable = false)
    private User guardiao;
}
