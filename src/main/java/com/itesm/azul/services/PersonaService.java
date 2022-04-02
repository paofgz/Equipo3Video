package com.itesm.azul.services;


import com.itesm.azul.models.Persona;
import com.itesm.azul.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService {

    @Autowired
    PersonaRepository personaRepository;

    public List<Persona> getAll(){
        return personaRepository.findAll();
    }

    public Persona insertar(Persona persona) throws Exception{
        if(persona.getEdad()<18){
            throw new Exception("No puedes ser menor de edad");
        }
        //personaRepository.insert();
        return persona;
    }


}
