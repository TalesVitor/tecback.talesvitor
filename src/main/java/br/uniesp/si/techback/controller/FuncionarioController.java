package br.uniesp.si.techback.controller;

import br.uniesp.si.techback.dto.FuncionarioDTO;
import br.uniesp.si.techback.model.Funcionario;
import br.uniesp.si.techback.service.FuncionarioService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    private final FuncionarioService service;

    @PostMapping
    public FuncionarioDTO criar(@Valid @RequestBody FuncionarioDTO dto) {
        return service.criar(dto);
    }

    @GetMapping
    public List<FuncionarioDTO> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public FuncionarioDTO buscar(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public FuncionarioDTO atualizar(@PathVariable Long id, @RequestBody FuncionarioDTO dto) {
        return service.atualizar(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
