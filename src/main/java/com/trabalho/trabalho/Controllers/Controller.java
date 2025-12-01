package com.trabalho.trabalho.Controllers;

import com.trabalho.trabalho.Models.Services.BaseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    public class Controller <E, S extends BaseService<E, ?>> {

        protected S service;
        public Controller(S service) {
            this.service = service;
        }

        @GetMapping()
        public List<E> listarEntidades() {
            return service.all();
        }

        @PostMapping
        public void cadastrarEntidade(@RequestBody E entidade) {
            service.create(entidade);
        }

        @PutMapping
        public void atualizarEntidade(@RequestBody E entidade) {
            service.save(entidade);
        }

        @DeleteMapping("/{id}")
        public void deletarEntidade(@RequestParam Long id) {
            service.delete(id);
        }
}
