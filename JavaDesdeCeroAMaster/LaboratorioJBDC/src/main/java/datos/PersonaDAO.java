package datos;

import domain.PersonaDTO;

import java.util.List;

public interface PersonaDAO {
    List<PersonaDTO> select();
    int insert (PersonaDTO persona);
    int update (PersonaDTO persona);
    int delete (PersonaDTO persona);

}
