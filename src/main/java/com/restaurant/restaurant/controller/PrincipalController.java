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
public class PrincipalController {

    @Autowired
    private UsuarioRepository repou;

    @GetMapping("/")
    public String verPaginaInicio(@ModelAttribute Usuario usuario, Model model, @AuthenticationPrincipal User user){
        try{
            usuario = repou.findByUsername(user.getUsername());
            model.addAttribute("usuario", usuario);
        }catch (Exception exception){
            return "index";
        }
        return "index";
    }

    @GetMapping("/login")
    public String abrirLogin( Model model) {
        model.addAttribute("usuario", new Usuario());

        return "login";
    }

    @GetMapping("/errores/403")
    public String error(Model model){

        return "error";
    }
}
