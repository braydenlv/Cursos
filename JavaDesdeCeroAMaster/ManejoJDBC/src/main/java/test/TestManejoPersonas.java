package test;

import datos.PersonaDAO;
import domain.Persona;

import java.util.List;

public class TestManejoPersonas {
    public static void main(String[] args) {
        System.out.println("============================SELECT============================");
        PersonaDAO personaDAO = new PersonaDAO(); //Data Access Object
        imprimirTabla(personaDAO);

        System.out.println("============================INSERT============================");
        //Insertando un nuevo objeto de tipo Persona
        Persona personaNueva = new Persona("Sandra","Jaramillo","sjaramillo@correo.com","6547898");
        personaDAO.insertar(personaNueva);
        imprimirTabla(personaDAO);
    }

    public static void imprimirTabla(PersonaDAO personaDAO){
        List<Persona> personas = personaDAO.seleccionar();
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }
}
