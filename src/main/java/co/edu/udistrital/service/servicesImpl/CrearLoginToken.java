/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udistrital.service.servicesImpl;


import co.edu.udistrital.service.model.OEUsuario;
import co.edu.udistrital.service.model.OSToken;

import javax.jws.WebParam;
import javax.jws.WebService;
import co.edu.udistrital.service.model.OEToken;
import co.edu.udistrital.service.utils.Response;

import javax.jws.WebResult;

/**
 *
 * @author Oscar
 */
@WebService
public interface CrearLoginToken {
 
    	  @WebResult(name="response")	
	  public OSToken crearLoginToken(@WebParam(name="u") OEToken oeToken );

}
