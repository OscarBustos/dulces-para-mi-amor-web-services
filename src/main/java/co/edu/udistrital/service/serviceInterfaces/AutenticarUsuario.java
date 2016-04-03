package co.edu.udistrital.service.serviceInterfaces;


import javax.jws.WebParam;
import javax.jws.WebService;

import co.edu.udistrital.service.utils.Response;

import javax.jws.WebResult;
@WebService
public interface AutenticarUsuario {
	  @WebResult(name="response")	
	  public Response autenticarUsuario(@WebParam(name="clientId") String clientId,@WebParam(name="correo") String correo, @WebParam(name="correo")  String password );
}
