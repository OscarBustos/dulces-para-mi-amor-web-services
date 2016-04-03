package co.edu.udistrital.service.serviceInterfaces;


import javax.jws.WebParam;
import javax.jws.WebService;

import co.edu.udistrital.service.utils.Response;

import javax.jws.WebResult;
@WebService

public interface RegistrarAmor {
	  @WebResult(name="response")	 
	  public Response registrarAmor(@WebParam(name="nombre") String nombre,@WebParam(name="correo") String correo,
			                        @WebParam(name="facebook")  String password , @WebParam(name="telefono")String telefono,
			                        @WebParam(name="foto1") String foto1, @WebParam(name="foto2") String foto2);
}
