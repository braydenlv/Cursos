package datos;

import domain.PersonaDTO;

import java.sql.SQLException;
import java.util.List;

public interface IPersonaDao {

    List<PersonaDTO> seleccionar() throws SQLException;
    int insertar (PersonaDTO persona) throws SQLException;
    int actualizar (PersonaDTO persona) throws SQLException;
    int eliminar (PersonaDTO persona) throws SQLException;

}
