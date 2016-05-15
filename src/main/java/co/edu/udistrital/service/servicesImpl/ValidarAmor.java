package co.edu.udistrital.service.servicesImpl;


import co.edu.udistrital.service.model.OEValidarAmor;
import co.edu.udistrital.service.model.OSValidarAmor;

import javax.jws.WebParam;
import javax.jws.WebService;

import co.edu.udistrital.service.utils.Response;

import javax.jws.WebResult;
@WebService
public interface ValidarAmor {
	  @WebResult(name="response")	
	  public OSValidarAmor validar(@WebParam(name="u") OEValidarAmor oeValidarAmor );
}
