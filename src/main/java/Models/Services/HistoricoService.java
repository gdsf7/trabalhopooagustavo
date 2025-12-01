package Models.Services;

import Models.Historico;
import Models.HistoricoRepository;
import org.springframework.stereotype.Service;

@Service
public class HistoricoService extends BaseService<Historico, HistoricoRepository> {
    public HistoricoService(HistoricoRepository historicoRepository) {
        super(historicoRepository);
    }
}