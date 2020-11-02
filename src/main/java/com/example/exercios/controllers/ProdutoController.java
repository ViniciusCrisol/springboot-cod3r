package com.example.exercios.controllers;

import com.example.exercios.models.entities.Produto;
import com.example.exercios.models.repositories.ProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutosRepository produtosRepository;

    @PostMapping
    public @ResponseBody Produto novoProduto(Produto produto) {
        produtosRepository.save(produto);
        return produto;
    }
}
