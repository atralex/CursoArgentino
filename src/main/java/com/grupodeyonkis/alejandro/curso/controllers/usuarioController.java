package com.grupodeyonkis.alejandro.curso.controllers;

import com.grupodeyonkis.alejandro.curso.models.Usuario;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class usuarioController {
    @RequestMapping(value ="usuario/{id}")
    public Usuario getUsuario(@PathVariable long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Pedro");
        usuario.setApellido("Picapiedras");
        usuario.setEmail("pedritopicapleitos@gmail.com");
        usuario.setPassword("surmano");
        usuario.setTelefono("655454544");

        return usuario;
    };


    @RequestMapping(value ="usuario2")
    public Usuario modificaUsuario(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Pedro");
        usuario.setApellido("Picapiedras");
        usuario.setEmail("pedritopicapleitos@gmail.com");
        usuario.setPassword("surmano");
        usuario.setTelefono("655454544");

        return usuario;
    };

    @RequestMapping(value ="usuario3")
    public Usuario listarUsuarios(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Pedro");
        usuario.setApellido("Picapiedras");
        usuario.setEmail("pedritopicapleitos@gmail.com");
        usuario.setPassword("surmano");
        usuario.setTelefono("655454544");

        return usuario;
    };
}
