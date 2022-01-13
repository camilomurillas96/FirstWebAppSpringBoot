package co.com.prueba;

import co.com.prueba.domain.Persona;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@Slf4j
/*Slf4j: se añade para ejecutar cosas en el lado del servidor osea 
 consola*/
public class ControladorInicio {
    
    @Value("${index.saludo}")
    private String saludo;
    
    @GetMapping("/")
    public String inicio(Model model){
        String mensaje = "Hola mundo con Thymeleaf";
        
        Persona persona = new Persona();
        persona.setNombre("Camilo");
        persona.setApellido("Gonzalez");
        persona.setEmail("prueba@hotm.com");
        persona.setTelefono("12345");
        
        Persona persona2 = new Persona();
        persona2.setNombre("Tati");
        persona2.setApellido("Omen");
        persona2.setEmail("tati@hotm.com");
        persona2.setTelefono("1234345");
              
        /*
        List<Persona> personas = new ArrayList();
        personas.add(persona);
        personas.add(persona2);
        */

        List<Persona> personas = Arrays.asList(persona, persona2);
        
        
                
        
        log.info("Ejecutando el controlador Spring MVC");
        model.addAttribute("mensaje", mensaje);
        model.addAttribute("saludo", saludo);
        //model.addAttribute("person", persona);
        model.addAttribute("personas", personas);
        return "index";
    }
}
