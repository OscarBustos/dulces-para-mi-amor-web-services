package co.edu.udistrital.service.servicesImpl;


import javax.jws.WebParam;
import javax.jws.WebService;

import co.edu.udistrital.service.utils.Response;

import javax.jws.WebResult;
@WebService
public interface ValidarAmor {
	  @WebResult(name="response")	
	  public Response validar(@WebParam(name="token") String token, @WebParam(name="foto1") String foto1, @WebParam(name="foto2")  String foto2 );
}
