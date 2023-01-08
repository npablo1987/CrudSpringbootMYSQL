package com.cloud.crud.cfgc.app.controllers;

import com.cloud.crud.cfgc.app.models.UsuarioModel;
import com.cloud.crud.cfgc.app.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    @GetMapping()
    public ArrayList<UsuarioModel> obtenerUsuarios(){
        return usuarioService.obtenerUsuarios();
    }

    @PostMapping()
    public UsuarioModel guardarUsuario(@RequestBody UsuarioModel usuario){
        return this.usuarioService.guardarUsuario(usuario);
    }

    @GetMapping( path = "/{rut}")
    public Optional<UsuarioModel> obtenerUsuarioPorId(@PathVariable("rut") Long rut) {
        return this.usuarioService.obtenerPorId(rut);
    }

    @DeleteMapping( path = "/{rut}")
    public String eliminarPorId(@PathVariable("rut") Long rut){
        boolean ok = this.usuarioService.eliminarUsuario(rut);
        if (ok){
            return "Se eliminó el usuario con rut " + rut;
        }else{
            return "No pudo eliminar el usuario con rut" + rut;
        }
    }

}
