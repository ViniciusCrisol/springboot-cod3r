package com.example.exercios.controllers;

import com.example.exercios.models.Cliente;
import org.springframework.web.bind.annotation.*;

@RestController
public class ClienteController {

    @GetMapping(path="/clientes/qualquer")
    public Cliente obterCliente(){
        return new Cliente(28, "Vinícin", "123.123.123-99");
    }

    @GetMapping(path="/clientes/{id}")
    public Cliente obterClientePorId01(@PathVariable int id){
        return new Cliente(id, "Vinícin", "43965555");
    }

    @PostMapping(path="/clientes")
    public Cliente obterClientePorId02(@RequestParam int id){
        return new Cliente(id, "Pedrin", "123.123.123-07");
    }
}
