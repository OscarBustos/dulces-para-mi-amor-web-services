package co.edu.udistrital.service.servicesImpl;

import co.edu.udistrital.service.serviceInterfaces.AutenticarUsuario;
import co.edu.udistrital.service.utils.Response;

public class AutenticarUsuarioImpl implements AutenticarUsuario{

	@Override
	public Response autenticar(String clientId ,String correo, String password) {
	Response response = new Response();
		
		if(correo == null){
			response.setCodigo(0);
			response.setMensaje("Parametro correo no encontrado");
			return response;
		}
		
		if(correo == password){
			response.setCodigo(0);
			response.setMensaje("Parametro  password no encontrado");
			return response;
		}

		if(correo.equals("test@dulcesparamiamor.com") && password.equals("123456") ){
			response.setCodigo(1);
			response.setMensaje("Usuairo autenticado correctamente");
	
		}else{
			response.setCodigo(0);
			response.setMensaje("Usuario o password no validos");
			
		}
		
	   return response;
	}

}
