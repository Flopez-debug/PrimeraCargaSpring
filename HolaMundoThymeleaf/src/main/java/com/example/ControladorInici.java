package com.example;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControladorInici {
    
    @Value("${Index.saludo}")
    private String saludo;
    
    @GetMapping("/")
    public String inicio(Model model){
        var mensaje = "Mensaje del duro Fabian con tymeleaf";
        log.info("controlando con MVC");
        model.addAttribute("mensaje", mensaje);
        model.addAttribute("saludo", saludo);
        return "Index";
    }
    
    
}
