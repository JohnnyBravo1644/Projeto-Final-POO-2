package com.unibave.prova.controller;

import com.unibave.prova.modelo.Produto;
import com.unibave.prova.repositorio.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produto")
public class ProvaCrudController {

    @Autowired
    private ProdutoRepository ProdutoRepository;

    @GetMapping
    public List<Produto> listar(){
        return ProdutoRepository.findAll();
    }

    @PostMapping
    public void incluir(@RequestBody Produto produto){
        ProdutoRepository.save(produto);
    }

    @PutMapping
    public void aterar(@RequestBody Produto produto){
        ProdutoRepository.save(produto);
    }

    @DeleteMapping("/{id_produto}")
    public void deletar(@PathVariable int id_produto){
        ProdutoRepository.deleteById(id_produto);
    }


    @GetMapping("/{id_produto}")
    public Optional<Produto> ler(@PathVariable int id_produto){
        return ProdutoRepository.findById(id_produto);
    }
}
