package com.trabalho.trabalho.Models.Services;

import com.trabalho.trabalho.Models.Historico;
import com.trabalho.trabalho.Models.HistoricoRepository;
import org.springframework.stereotype.Service;

@Service
public class HistoricoService extends BaseService<Historico, HistoricoRepository> {
    public HistoricoService(HistoricoRepository historicoRepository) {
        super(historicoRepository);
    }
}