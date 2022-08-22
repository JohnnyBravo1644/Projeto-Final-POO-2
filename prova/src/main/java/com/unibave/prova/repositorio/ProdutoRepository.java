package com.unibave.prova.repositorio;

import com.unibave.prova.modelo.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
