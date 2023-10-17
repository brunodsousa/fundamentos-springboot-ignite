package br.com.brunosousa.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraController")
public class PrimeiraController {

    @GetMapping("/primeiroMetodo/{id}")
    // /primeiraController/primeiroMetodo/189
    public String primeiroMetodo(@PathVariable String id) {
        return "O parâmetro é " + id;
    }

    @GetMapping("/metodoComQueryParams")
    // /primeiraController/metodoComQueryParams?id=189
    public String metodoComQueryParams(@RequestParam String id) {
        return "O parâmetro com metodoComQueryParams é " + id;
    }

    @GetMapping("/metodoComQueryParams2")
    // /primeiraController/metodoComQueryParams?id=189&nome=Bruno
    public String metodoComQueryParams2(@RequestParam Map<String, String> allParams) {
        // O parâmetro com metodoComQueryParams2 é [id=189, nome=Bruno]
        return "O parâmetro com metodoComQueryParams2 é " + allParams.entrySet();
    }
}
