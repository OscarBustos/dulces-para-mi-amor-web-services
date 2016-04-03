package co.edu.udistrital.service.servicesImpl;

import co.edu.udistrital.service.serviceInterfaces.ValidarAmor;
import co.edu.udistrital.service.utils.Response;

public class ValidarAmorImpl implements ValidarAmor {

	@Override
	public Response validar(String token, String foto1, String foto2) {
		Response response = new Response();
		
		if(token != null){
			response.setToken(token);
		}else{
			response.setCodigo(0);
			response.setMensaje("Parametro token no encontrado");
			return response;
		}

		if(foto1 != null){
			response.setCodigo(1);
			response.setMensaje("OK");
			return response;
		} else{
			response.setCodigo(0);
			response.setMensaje("Parametro foto1 no encontrado");
			return response;
		}
		
	}

}
