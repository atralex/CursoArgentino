package com.grupodeyonkis.alejandro.curso.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class usuarioController {
    @RequestMapping(value ="prueba")
    public List<String> prueba(){
        return List.of("manzana", "pera", "mandarina");
    };
}
