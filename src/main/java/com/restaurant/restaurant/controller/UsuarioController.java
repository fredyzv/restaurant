package com.restaurant.restaurant.controller;

import com.restaurant.restaurant.model.Usuario;
import com.restaurant.restaurant.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioRepository repou;

    @GetMapping("/usuario/listar")
    public String listarUsuario(@ModelAttribute Usuario usuario, Model model, @AuthenticationPrincipal User user){
        usuario = repou.findByUsername(user.getUsername());
        model.addAttribute("usuario", usuario);
        model.addAttribute("lstUsuarios", repou.findAll());
        return "listar-usuario";
    }
}
