package com.trabalho.trabalho.Controllers;

import com.trabalho.trabalho.Models.Services.DisciplinaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.trabalho.trabalho.Models.Disciplina;

@RestController
@RequestMapping
public class DisciplinaController extends Controller<Disciplina, DisciplinaService> {
    public DisciplinaController(DisciplinaService disciplina) {
        super(disciplina);
    }
}
