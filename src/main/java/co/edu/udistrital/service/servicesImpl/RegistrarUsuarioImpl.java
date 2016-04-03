package co.edu.udistrital.service.servicesImpl;

import co.edu.udistrital.service.serviceInterfaces.RegistrarUsuario;
import co.edu.udistrital.service.utils.Response;

public class RegistrarUsuarioImpl implements RegistrarUsuario{

	@Override
	public Response registrar(String clientId, String nombre, String correo, String password) {
            Response response = new Response();
		if(nombre == null){
			response.setCodigo(0);
			response.setMensaje("Parametro nombre no encontrado");
			return response;
		}
		

		if(correo == null){
		   response.setCodigo(0);
		   response.setMensaje("Parametro correo no encontrado");
		   return response;
		} 
				
		if(password == null){
		   response.setCodigo(0);
		   response.setMensaje("Parametro password no encontrado");
		   return response;
		} 
		
		response.setCodigo(1);
		response.setToken("123456789");
		response.setMensaje("Registro exitoso");
		return response;
	}

}
