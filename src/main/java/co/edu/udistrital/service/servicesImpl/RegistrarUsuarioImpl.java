package co.edu.udistrital.service.servicesImpl;

import co.edu.udistrital.service.model.OEUsuario;
import co.edu.udistrital.service.model.OSUsuario;
import co.edu.udistrital.service.utils.Response;

public class RegistrarUsuarioImpl implements RegistrarUsuario{

	@Override
	public OSUsuario registrarUsuario(OEUsuario oeUsuario) {
            String nombre = oeUsuario.getNombre();
            String correo = oeUsuario.getCorreo();
            String password = oeUsuario.getClave();
            OSUsuario osUsuario = new OSUsuario();
		if(nombre == null){
			osUsuario.setCodigoRespuesta(0);
			osUsuario.setMensajeRespuesta("Parametro nombre no encontrado");
			return osUsuario;
		}
		

		if(correo == null){
			osUsuario.setCodigoRespuesta(0);
			osUsuario.setMensajeRespuesta("Parametro nombre no encontrado");
			return osUsuario;
		} 
				
		if(password == null){
			osUsuario.setCodigoRespuesta(0);
			osUsuario.setMensajeRespuesta("Parametro nombre no encontrado");
			return osUsuario;
		} 
		

		osUsuario.setCodigoRespuesta(1);
		osUsuario.setMensajeRespuesta("Registro exitoso");
		return osUsuario;
	}

}
