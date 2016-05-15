package co.edu.udistrital.service.servicesImpl;

import co.edu.udistrital.service.model.OEAutenticar;
import co.edu.udistrital.service.model.OSAutenticar;
import co.edu.udistrital.service.utils.Response;

public class AutenticarUsuarioImpl implements AutenticarUsuario {

	@Override
	public OSAutenticar autenticarUsuario(OEAutenticar oeAutenticar) {
		String correo = oeAutenticar.getCorreo();
		String password = oeAutenticar.getClave();
		String token = oeAutenticar.getToken();
		OSAutenticar osAutenticar = new OSAutenticar();

		if (correo == null) {
			osAutenticar.setCodigoRespuesta(0);
			osAutenticar.setMensajeRespuesta("Parametro correo no encontrado");

			return osAutenticar;
		}

		if (correo == password) {
			osAutenticar.setCodigoRespuesta(0);
			osAutenticar
					.setMensajeRespuesta("Parametro  password no encontrado");

			return osAutenticar;

		}

		if (correo.equals("test@dulcesparamiamor.com")
				&& password.equals("123456")) {
			osAutenticar.setCodigoRespuesta(1);
			osAutenticar
					.setMensajeRespuesta("Usuairo autenticado correctamente");

			return osAutenticar;

		} else {
			osAutenticar.setCodigoRespuesta(0);
			osAutenticar.setMensajeRespuesta("Usuario o password no validos");

			return osAutenticar;

		}

	}
}
