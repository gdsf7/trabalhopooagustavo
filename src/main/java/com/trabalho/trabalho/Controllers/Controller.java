package com.trabalho.trabalho.Controllers;

import Services.BaseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    public class Controller <E, S extends BaseService<E, ?>> {

        protected S service;
        public Controller(S service) {
            this.service = service;
        }

        @CrossOrigin("http://localhost:4200")
        @GetMapping()
        public List<E> listarEntidades() {
            return service.all();
        }

        @CrossOrigin("http://localhost:4200")
        @PostMapping
        public void cadastrarNovaEntidade(@RequestBody E entidade) {
            service.create(entidade);
        }

        @CrossOrigin("http://localhost:4200")
        @PutMapping
        public void atualizarEntidade(@RequestBody E entidade) {
            service.save(entidade);
        }

        @CrossOrigin("http://localhost:4200")
        @DeleteMapping("/{id}")
        public void deletarEntidade(@RequestParam Long id) {
            service.delete(id);
        }
}
