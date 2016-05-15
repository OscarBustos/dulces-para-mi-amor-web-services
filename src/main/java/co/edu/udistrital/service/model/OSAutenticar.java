package co.edu.udistrital.service.model;

public class OSAutenticar {

	private int codigoRespuesta;
	private String mensajeRespuesta;

	public String getMensajeRespuesta() {
		return mensajeRespuesta;
	}

	public int getCodigoRespuesta() {
		return codigoRespuesta;
	}

	public void setCodigoRespuesta(int codigoRespuesta) {
		this.codigoRespuesta = codigoRespuesta;
	}

	public void setMensajeRespuesta(String mensajeRespuesta) {
		this.mensajeRespuesta = mensajeRespuesta;
	}

}
