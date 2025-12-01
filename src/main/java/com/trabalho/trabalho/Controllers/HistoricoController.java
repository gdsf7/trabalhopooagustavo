package com.trabalho.trabalho.Controllers;

import com.trabalho.trabalho.Models.Historico;
import com.trabalho.trabalho.Models.Services.HistoricoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HistoricoController extends Controller<Historico, HistoricoService> {
    public HistoricoController(HistoricoService historico) {
        super(historico);
    }
}
