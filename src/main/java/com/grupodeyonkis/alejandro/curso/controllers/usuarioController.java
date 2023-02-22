package com.grupodeyonkis.alejandro.curso.controllers;

import com.grupodeyonkis.alejandro.curso.models.Usuario;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class usuarioController {
    @RequestMapping(value ="usuarios")
    public List <Usuario> getUsuario(){
        List <Usuario> usuarios = new ArrayList<>();
        Usuario usuario = new Usuario();
        usuario.setId(1234);
        usuario.setNombre("Pedro");
        usuario.setApellido("Picapiedras");
        usuario.setEmail("pedritopicapleitos@gmail.com");
        usuario.setPassword("surmano");
        usuario.setTelefono("655454544");

        Usuario usuario2 = new Usuario();
        usuario2.setId(2323);
        usuario2.setNombre("Juan");
        usuario2.setApellido("Picapiedras");
        usuario2.setEmail("pedricapleitos@gmail.com");
        usuario2.setPassword("surano");
        usuario2.setTelefono("655454544");

        Usuario usuario3 = new Usuario();
        usuario3.setId(3232);
        usuario3.setNombre("Jose");
        usuario3.setApellido("Picapiedras");
        usuario3.setEmail("pedritopicapleitos@gmail.com");
        usuario3.setPassword("surmano");
        usuario3.setTelefono("655454544");

        Usuario usuario4 = new Usuario();
        usuario4.setId(4343);
        usuario4.setNombre("Maricarmen");
        usuario4.setApellido("Picapiedras");
        usuario4.setEmail("pedritopicapleitos@gmail.com");
        usuario4.setPassword("surmano");
        usuario4.setTelefono("655454544");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        usuarios.add(usuario4);
        return usuarios;
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
