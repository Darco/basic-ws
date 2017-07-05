package ${package}.persistence.dao.impl;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import ${package}.model.${className}TO;
import ${package}.persistence.dao.${className}Dao;
import ${package}.persistence.mapper.${className}RowMapper;

@Repository
public class ${className}DaoImpl implements ${className}Dao {

    public static final Logger LOGGER = LoggerFactory.getLogger(${className}DaoImpl.class);

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public ${className}TO get${className}TO(int id){

        ${className}TO to = null;

        try {
            final String sql = "SELECT * FROM users WHERE id = :id";

            final Map<String, Object> params = new HashMap<>();
            params.put("id", id);

            to = this.namedParameterJdbcTemplate.queryForObject(sql, params, new ${className}RowMapper());

        } catch (DataAccessException e) {
            LOGGER.error(e.getMessage(), e);
        }
        return to;
    }

}