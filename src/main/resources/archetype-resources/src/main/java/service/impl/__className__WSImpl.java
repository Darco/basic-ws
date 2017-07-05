package ${package}.service.impl;

import javax.jws.WebService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import ${package}.model.${className}TO;
import ${package}.service.${className}Service;

import ${domainPackage}.${namespacePackage}.${namespaceVersion}.schemas.${className}Type;
import ${domainPackage}.${namespacePackage}.${namespaceVersion}.service.${className}PortType;
/**
 * @author David Ruiz Coronel
 *
 */
@WebService(endpointInterface   = "${domainPackage}.${namespacePackage}.${namespaceVersion}.service.${className}PortType",
            serviceName         = "${wsdlName}Service",
            targetNamespace     = "http://${domain}/${namespace}/${namespaceVersion}/service",
            wsdlLocation        = "/WEB-INF/wsdl/${wsdlName}-service.wsdl",
            portName            = "${wsdlName}Port")
public class ${className}WSImpl extends SpringBeanAutowiringSupport implements ${className}PortType {

    private static final Logger LOGGER = LoggerFactory.getLogger(${className}WSImpl.class);

    @Autowired
    private ${className}Service service;

    @Override
    public ${className}Type demo(int pruebaRq) {
        final ${className}TO to = service.get${className}TO(pruebaRq);
        final ${className}Type type = new ${className}Type();
        type.setMessage(to.getMessage());
        type.setName(to.getName());
        return type;
    }


}
