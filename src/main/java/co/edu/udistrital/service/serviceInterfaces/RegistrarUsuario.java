package co.edu.udistrital.service.serviceInterfaces;


import javax.jws.WebParam;
import javax.jws.WebService;

import co.edu.udistrital.service.utils.Response;

import javax.jws.WebResult;
@WebService
public interface RegistrarUsuario {
	  @WebResult(name="response")	
	  public Response registrar(@WebParam(name="nombre") String  clientId, @WebParam(name="nombre") String nombre,@WebParam(name="correo") String correo, @WebParam(name="correo")  String password );
}
