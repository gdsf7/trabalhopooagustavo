package com.trabalho.trabalho.Models.Services;

import com.trabalho.trabalho.Models.Disciplina;
import com.trabalho.trabalho.Models.DisciplinaRepository;
import org.springframework.stereotype.Service;

@Service
public class DisciplinaService extends BaseService<Disciplina, DisciplinaRepository> {
    public DisciplinaService(DisciplinaRepository disciplinaRepository) {
        super(disciplinaRepository);
    }
}
