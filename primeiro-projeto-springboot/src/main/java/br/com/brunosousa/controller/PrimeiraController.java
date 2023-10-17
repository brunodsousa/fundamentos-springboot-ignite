package br.com.brunosousa.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
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

    @PostMapping("/metodoComBodyParams")
    public String metodoComBodyParams(@RequestBody Usuario usuario) {
        return "metodoComBodyParams " + usuario.username();
    }

    @PostMapping("/metodoComHeaders")
    public String metodoComHeaders(@RequestHeader("name") String name) {
        return "metodoComHeaders " + name;
    }

    @PostMapping("/metodoComListHeaders")
    public String metodoComListHeaders(@RequestHeader("name") Map<String, String> headers) {
        return "metodoComHeaders " + headers.entrySet();
    }

    record Usuario(String username) {
    }
}
