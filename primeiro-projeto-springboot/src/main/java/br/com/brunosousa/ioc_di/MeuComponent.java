package br.com.brunosousa.ioc_di;

import org.springframework.stereotype.Service;

@Service
public class MeuComponent {
    public String chamarMeuComponent() {
        return "Chamando meu component.";
    }
}
