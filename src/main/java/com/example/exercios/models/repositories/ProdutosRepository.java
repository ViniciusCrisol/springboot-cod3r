package com.example.exercios.models.repositories;

import com.example.exercios.models.entities.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutosRepository extends CrudRepository<Produto, Integer> {

}
