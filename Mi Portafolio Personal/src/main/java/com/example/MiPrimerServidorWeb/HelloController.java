package com.example.MiPrimerServidorWeb;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String greeting(){
        return "Hola mundo desde mi primer servidor";
    }

    @GetMapping("/saludo")
    public String saludoNombre(@RequestParam String nombre){
        return "Hola, "+nombre+"!";
    }

    @PostMapping("/mensaje")
    public String recibirMensaje(@RequestBody String texto) {
        return "Texto: " + texto+", Recibido!";
    }
}
