package Models.Services;

import Models.Disciplina;
import Models.DisciplinaRepository;
import org.springframework.stereotype.Service;

@Service
public class DisciplinaService extends BaseService<Disciplina, DisciplinaRepository> {
    public DisciplinaService(DisciplinaRepository disciplinaRepository) {
        super(disciplinaRepository);
    }
}
