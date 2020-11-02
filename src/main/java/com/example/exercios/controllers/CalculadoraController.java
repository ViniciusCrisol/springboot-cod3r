package com.example.exercios.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraController {

    @GetMapping(path = "/somar/{numero01}/{numero02}")
    public int sumar(@PathVariable int numero01, @PathVariable int numero02) {
        return (numero01 + numero02);
    }

    @GetMapping(path = "subtrair")
    public int subtrair(@RequestParam int numero01, @RequestParam int numero02) {
        return (numero01 - numero02);
    }
}
