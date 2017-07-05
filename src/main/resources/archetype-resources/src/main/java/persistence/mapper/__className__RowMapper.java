package ${package}.persistence.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import ${package}.model.${className}TO;

/**
 * Clase encargada de generar un objeto ${className}TO a partir de un registro de la base de datos.
 * @author
 */
public class ${className}RowMapper implements RowMapper<${className}TO> {

    @Override
    public ${className}TO mapRow(ResultSet rs, int rowNum) throws SQLException {
        ${className}TO to = new ${className}TO();

        to.setName(rs.getString("name"));
        to.setMessage(rs.getString("message"));

        return to;
    }

}