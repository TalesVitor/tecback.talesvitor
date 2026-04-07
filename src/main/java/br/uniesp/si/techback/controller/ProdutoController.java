package br.uniesp.si.techback.controller;

import br.uniesp.si.techback.model.Produto;
import br.uniesp.si.techback.service.ProdutoService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private final ProdutoService service;

    public ProdutoController(ProdutoService service) {
        this.service = service;
    }

    @PostMapping
    public Produto criar(@RequestBody @Valid Produto produto) {
        return service.criar(produto);
    }

    @GetMapping
    public List<Produto> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Produto buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public Produto atualizar(@PathVariable Long id, @RequestBody @Valid Produto produto) {
        return service.atualizar(id, produto);
    }

    @DeleteMapping("/{id}")
    public String deletar(@PathVariable Long id) {
        service.deletar(id);
        return "Produto deletado com sucesso!";
    }
}
