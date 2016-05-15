/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udistrital.service.servicesImpl;

import co.edu.udistrital.service.model.OEToken;
import co.edu.udistrital.service.model.OSToken;
import co.edu.udistrital.service.utils.Response;

/**
 *
 * @author Oscar
 */
public class CrearLoginTokenImpl implements CrearLoginToken {

    @Override
    public OSToken crearLoginToken(OEToken oeToken) {
        OSToken osToken = new OSToken();
        osToken.setCodigoRespuesta(1);
        osToken.setMensajeRespuesta("Token generado");
        osToken.setToken("");
    	return osToken;
    }
    
}
