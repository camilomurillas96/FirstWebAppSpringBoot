package co.com.prueba.domain;

import lombok.Data;

@Data
/*
Data hace parte de lombok donde crea constructor vacio, Sets,
Gets, Hashcode, ToString y entre otras lo puedes revisar en el 
navigator
*/
public class Persona {
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    
    //como estamos usando lombook crea los set,get, toString
}
