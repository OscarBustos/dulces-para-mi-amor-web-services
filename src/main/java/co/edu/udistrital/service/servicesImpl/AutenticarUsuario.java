package co.edu.udistrital.service.servicesImpl;


import co.edu.udistrital.service.model.OEAutenticar;
import co.edu.udistrital.service.model.OSAutenticar;

import javax.jws.WebParam;
import javax.jws.WebService;

import co.edu.udistrital.service.utils.Response;

import javax.jws.WebResult;
@WebService
public interface AutenticarUsuario {
	  @WebResult(name="response")	
	  public OSAutenticar autenticarUsuario(@WebParam(name="u") OEAutenticar oeAutenticar );
}
