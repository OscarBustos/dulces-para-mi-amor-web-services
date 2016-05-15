package co.edu.udistrital.service.servicesImpl;

import co.edu.udistrital.service.model.OEValidarAmor;
import co.edu.udistrital.service.model.OSValidarAmor;
import co.edu.udistrital.service.utils.Response;

public class ValidarAmorImpl implements ValidarAmor {

	@Override
	public OSValidarAmor validar(OEValidarAmor oeValidarAmor) {
            
            String token;
            String foto1 = oeValidarAmor.getImagenAmor();
            String foto2;
		OSValidarAmor osValidarAMor = new OSValidarAmor();
		
	/*	if(token != null){
			//response.setToken(token);
		}else{
			osValidarAMor.setCodigoRespuesta(0);
			osValidarAMor.setMensajeRespuesta("Parametro token no encontrado");
			return osValidarAMor;
		}
*/
		if(foto1 != null){
			osValidarAMor.setCodigoRespuesta(1);
			osValidarAMor.setMensajeRespuesta("OK");
			return osValidarAMor;
		} else{

			osValidarAMor.setCodigoRespuesta(0);
			osValidarAMor.setMensajeRespuesta("Parametro foto1 no encontrado");
			return osValidarAMor;
		}
		
	}

}
