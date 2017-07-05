package ${package}.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;
import org.springframework.stereotype.Service;

import ${package}.model.${className}TO;
import ${package}.persistence.dao.${className}Dao;
import ${package}.service.${className}Service;

@Service
public class ${className}ServiceImpl implements ${className}Service {

    private static final Logger LOGGER = LoggerFactory.getLogger(${className}ServiceImpl.class);

    @Autowired
    private ${className}Dao dao;

    public ${className}TO get${className}TO(int id){

        ${className}TO to = dao.get${className}TO(id);

        if( to == null ){
            to = new ${className}TO();
            to.setName("Sin");
            to.setMessage("Informacion");
        }

        return to;
    }

}