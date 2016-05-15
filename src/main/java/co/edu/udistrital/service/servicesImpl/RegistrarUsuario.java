package co.edu.udistrital.service.servicesImpl;


import co.edu.udistrital.service.model.OEUsuario;
import co.edu.udistrital.service.model.OSUsuario;

import javax.jws.WebParam;
import javax.jws.WebService;

import co.edu.udistrital.service.utils.Response;

import javax.jws.WebResult;
@WebService
public interface RegistrarUsuario {
	  @WebResult(name="response")	
	  public OSUsuario registrarUsuario(@WebParam(name="u") OEUsuario oeUsuario );
}
