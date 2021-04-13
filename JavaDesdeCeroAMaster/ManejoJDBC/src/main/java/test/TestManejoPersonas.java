package test;

import datos.PersonaDAO;
import domain.Persona;

import java.util.List;

public class TestManejoPersonas {
    public static void main(String[] args) {

        PersonaDAO personaDAO = new PersonaDAO(); //Data Access Object

        System.out.println("============================SELECT============================");
        imprimirTabla(personaDAO);

        System.out.println("============================INSERT============================");
        //Insertando un nuevo objeto de tipo Persona
        Persona persona = new Persona("Pedro","Sanchez","psanchez@correo.com","7418596");
        personaDAO.insertar(persona);
        imprimirTabla(personaDAO);

        System.out.println("============================UPDATE============================");
        //Se cambian los valores para la prueba
        persona.setIdPersona(7);
        persona.setNombre("Pablo");
        //se ejecuta
        personaDAO.actualizar(persona);
        imprimirTabla(personaDAO);

        System.out.println("============================DELETE============================");
        personaDAO.eliminar(persona);
        imprimirTabla(personaDAO);

    }

    public static void imprimirTabla(PersonaDAO personaDAO){
        List<Persona> personas = personaDAO.seleccionar();
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }
}
