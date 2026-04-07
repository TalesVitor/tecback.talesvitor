package br.uniesp.si.techback.repository;

import br.uniesp.si.techback.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
