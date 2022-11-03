
package com.Proyecto2022.PGalun.inteface;

import com.Proyecto2022.PGalun.Entidades.Persona;
import java.util.List;

public interface IPersonaService {
    //Traer lista de Persona
     public List<Persona> getPersona();
     
     //Guardar una perosna
      public void savePersona(Persona persona);
      
     // Eliminar Persona
      public void deletePersona(Long Id);
      
      //Buscar Persona por Id
      public Persona findPersona(Long id);
     
     
     
}
